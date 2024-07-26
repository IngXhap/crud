const express = require('express');
const app = express();
const path = require('path');
const morgan = require('morgan');
const bodyParser = require('body-parser');
const mysql = require('mysql2');
const PORT = process.env.PORT || 3000;
const ip = process.env.IP || 'localhost';

// Configuración de la base de datos
const connection = mysql.createConnection({
    host: 'escuela.cpc8ii0w6226.us-east-1.rds.amazonaws.com',  // Cambia esto a la dirección de tu base de datos en la nube
    user: 'roberto',
    password: 'roberto123456789',
    database: 'VILLA_DEL_SUR'
});

connection.connect((err) => {
    if (err) {
        console.error('Error conectando a la base de datos:', err);
        return;
    }
    console.log('Conexión a la base de datos exitosa');
});

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(morgan('dev'));
app.use(express.static('public/'));

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

app.post('/guardar', (req, res) => {
    const { dni, nombre, apellido, fecha_nacimiento, sexo, celular, correo, direccion, tipo_habitacion } = req.body;

    const sql = 'INSERT INTO hotel (dni, nombre, apellido, fecha_nacimiento, sexo, celular, correo, direccion, tipo_habitacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)';
    const values = [dni, nombre, apellido, fecha_nacimiento, sexo, celular, correo, direccion, tipo_habitacion];

    connection.query(sql, values, (err, result) => {
        if (err) {
            console.error('Error al guardar los datos', err);
            res.status(500).send('Error al guardar los datos');
        } else {
            console.log('Datos guardados correctamente', req.body);
            res.send('Datos guardados correctamente');
        }
    });
});

app.listen(PORT, () => {
    console.log(`Servidor conectado en http://${ip}:${PORT}`);
});
