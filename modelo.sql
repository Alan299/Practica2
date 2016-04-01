CREATE TABLE Login(

	id integer PRIMARY KEY,
	usuario	text NOT NULL  ,
	password	text NOT NULL,
	UNIQUE(usuario)
);


COMMENT ON TABLE Login IS
'Tabla para inicio de sesion,  almacena el usuario y la contraseña (password)';



 

CREATE TABLE Usuario (
	id integer PRIMARY KEY,
	nombre text Not null,
	correo text,
	sexo VARCHAR(1)
	
);
