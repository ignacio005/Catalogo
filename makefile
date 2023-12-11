JAVA=src/aplicacion/Principal.java src/dominio/Catalogo.java src/dominio/Coche.java src/dominio/enun/*.java src/presentacion/Interfaz.java
CLASS=aplicacion/Principal.class dominio/Catalogo.class dominio/Coche.class dominio/enun/*.class presentacion/Interfaz.class

# Por defecto hacemos el jar
default: jar

# Con all hacemos el jar y borramos los class
all: jar clean

jar: class
	jar cvfm catalogo.jar Manifest.txt $(CLASS)

class:$(JAVA)
	javac -d ./ $(JAVA)

clean:
	rm $(CLASS)