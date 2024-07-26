const mysql = require('mysql2');

connection= mysql.createConnection({
    host:'escuela.cpc8ii0w6226.us-east-1.rds.amazonaws.com',
    user:'roberto',
    password:'roberto123456789',
    database:'VILLA_DEL_SUR',
    port:'3306'
});

connection.connect((err)=>{
    if(err){
        throw err;
    }else{
        console.log('conectado correctamente')
    }
})

module.exports= connection;
