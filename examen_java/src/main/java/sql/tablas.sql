drop database if exists operador_actividades;
create database operador_actividades;

use operador_actividades;

DROP table if exists cliente;
create table Cliente (
	id int auto_increment primary key,
	nombre varchar(100) not null,
	representante varchar(100),
	correo varchar(100),
	telefono bigint,
	direccion varchar(100),
 	sector Enum("Tecnologia", "Salud", "Educacion", "Comercio", "Manufactura")
);

DROP table if exists Servicio;
create table Servicio (
	id int auto_increment primary key,
	nombre varchar(100) not null,
	descripcion varchar(500),
	precioPorHora int,
	categoria enum("TI", "Limpieza", "Seguridad", "Administracion")
);


drop table if exists Contrato;
create table Contrato (
	id int auto_increment primary key,
	id_cliente int,
	foreign key (id_cliente) references Cliente(id),
	id_servicio int,
	foreign key (id_servicio) references Servicio(id),
	fechaInicio datetime,
	fechaFin datetime,
	costoTotal int not null,
	estado enum("Activo", "En_espera", "Finalizado")
);


drop table if exists Proyecto;
create table Proyecto (
	id int auto_increment primary key,
	id_cliente int,
	foreign key (id_cliente) references Cliente(id),
	nombre varchar(100) not null,
	fechaInicio datetime,
	fechaFin datetime,
	estado enum("En_curso", "Completado", "Cancelado")
);



drop table if exists Empleado;
create table Empleado (
	id int auto_increment primary key,
	nombre varchar(50) not null,
	cargo varchar(100),
	salario int,
	especialidad enum("TI", "Administracion", "Limpieza", "Seguridad"),
	id_proyecto int,
	foreign key (id_proyecto) references Proyecto(id)
);


drop table if exists Asignacion;
create table Asignacion (
	id int auto_increment primary key,
	id_empleado int,
	foreign key (id_empleado) references Empleado(id),
	id_proyecto int,
	foreign key (id_proyecto) references Proyecto(id),
	horasTrabajadas int not null,
	fechaAsignacion datetime
);
	






