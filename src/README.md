# Lista Doblemente Enlazada con Películas

Proyecto en Java que implementa una lista doblemente enlazada genérica y la usa para almacenar películas, recorriéndolas de inicio a fin y de fin a inicio.

## Descripción

Este proyecto implementa una lista doblemente enlazada genérica (`DoublyLinkedList<T>`). Cada nodo guarda una referencia al siguiente y otra al anterior, por lo que la lista se puede recorrer en ambas direcciones.

Para demostrar que la lista funciona con cualquier tipo de dato, se creó una clase `Movie`, completamente distinta de la clase `Book` original, y se usa en el `Main` para almacenar películas.

Objetivos principales:
- Reutilizar la lista genérica con una clase nueva
- Insertar 3 elementos con `insertFirst` e `insertLast`
- Recorrer la lista con `traverse()` y con `traverseBackward()`

## Tecnologías Utilizadas

- Java
- IntelliJ IDEA

## Requisitos Previos

- JDK 8 o superior
- IntelliJ IDEA (o cualquier IDE compatible con Java)

## Instalación

1. Clona este repositorio:

  -  git clone https://github.com/tu-usuario/tu-proyecto.git


2. Abre la carpeta del proyecto en IntelliJ IDEA:

   - File > Open > selecciona la carpeta del proyecto


3. Verifica que `Main.java`, `Movie.java`, `Book.java`, `DoublyNode.java` y `DoublyLinkedList.java` estén en el mismo paquete

## Uso

1. Abre `Main.java` en IntelliJ IDEA
2. Presiona el botón **Run** para ejecutarlo
3. El programa hace lo siguiente:
   - Crea una lista de `Movie`
   - Inserta **Inception** con `insertLast`
   - Inserta **Coco** con `insertLast`
   - Inserta **Parasite** con `insertFirst`, por lo que queda al inicio
   - Recorre la lista con `traverse()` y luego con `traverseBackward()`

### Salida esperada

```
Recorrido normal:
[Parasite (2019) dirigida por Bong Joon-ho], [Inception (2010) dirigida por Christopher Nolan], [Coco (2017) dirigida por Lee Unkrich],
Recorrido hacia atrás:
[Coco (2017) dirigida por Lee Unkrich], [Inception (2010) dirigida por Christopher Nolan], [Parasite (2019) dirigida por Bong Joon-ho],
```

## Características

- Lista doblemente enlazada genérica (`DoublyLinkedList<T>`)
- Inserción al inicio (`insertFirst`) y al final (`insertLast`)
- Recorrido hacia adelante (`traverse`) y hacia atrás (`traverseBackward`)
- Búsqueda (`contains`), eliminación (`remove`) y vaciado (`clear`)
- Clase `Movie` con título, director y año

## Autores

**Yerik Ian Lugo Vasquez**

- Email: yerikianlv@gmail.com

---