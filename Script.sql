create database SIU;
use SIU;
-- Drop database SIU;

create table carreras(
	codigo_carreras varchar(5) primary key,
    nombre_carreras varchar(45) not null,
    estatus_carreras varchar(1) not null
)engine=InnoDB;

create table Facultad
(
 codigo_Facultad varchar(5) primary key,
 nombre_Facultad varchar(45) not null,
 Estatus_Facultad varchar(1)
)Engine= InnoDB;

create table secciones(
	codigo_secciones varchar(5) primary key,
    nombre_secciones varchar(5) not null,
    estatus_secciones varchar(1) not null
)engine=InnoDB;


create table Alumno
(
carnet_Alumnos varchar (15) primary key,
nombre_Alumnos varchar(45) not null,
direccion_Alumnos varchar (45)not null,
telefono_Alumnos varchar (45) not null,
email_Alumnos varchar (45),
estatus_Alumno varchar(1),

codigo_carreras varchar(5),
codigo_facultad varchar(5),
codigo_secciones varchar(5),

foreign key (codigo_carreras) references carreras(codigo_carreras),
foreign key (codigo_facultad) references Facultad(codigo_Facultad),
foreign key (codigo_secciones) references secciones(codigo_secciones)

)engine = InnoDB;

create table Maestros 
(
	codigo_maestro varchar(5)  primary key,
	nombre_maestro varchar (45) not null,
	direccion_maestro varchar (45) not null,
	telefono_maestro varchar (45) not null,
	email_maestro varchar (45) not null,
	estatus_maestro varchar (1) not null
)engine= InnoDB;


create table Cursos
(
 codigo_cursos varchar(5) primary key,
 nombre_Cursos varchar(45) not null,
 Estatus_Cursos varchar(1)
)Engine= InnoDB;

create table Asignacion_alumno(
	carnet_Alumnos varchar (15),
    codigo_cursos varchar(5),
    
    foreign key (carnet_Alumnos) references Alumno (carnet_Alumnos),
    foreign key (codigo_cursos) references Cursos (codigo_cursos)
    
)engine=InnoDB;


create table Asignacion_maestro(
	codigo_maestro varchar(5) ,
	codigo_cursos varchar(5),
    
    foreign key (codigo_maestro) references Maestros (codigo_maestro),
    foreign key (codigo_cursos) references Cursos (codigo_cursos)
)engine=InnoDB;