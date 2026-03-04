# Examen de Recuperación — Unidad 2 (Versión 2C-B, Java, sin arreglos)

## Objetivo
Evaluar estructuras de control (if/else, while), validación de entradas con Scanner.hasNextX, uso de métodos static y control de flujo con continue, break y return.

## Restricciones
1) Prohibido usar arreglos (arrays), colecciones (List, Set, Map) o streams.
2) Prohibido usar archivos, bases de datos o librerías externas.
3) Todo debe estar en consola.
4) No se acepta trabajo en la rama main. Si realizas push a main, el examen queda reprobado.

## Entrega (Git)
1) Clona el repositorio:
   git clone <URL_DEL_REPO>
2) Entra a la carpeta:
   cd <carpeta_del_repo>
3) Crea tu rama con la nomenclatura:
   nombres-apellidoPaterno-gradoygrupo
   Ejemplo: elieldavid-rodriguez-2c
4) Cambia a tu rama:
   git checkout -b elieldavid-rodriguez-2c
5) Abre el proyecto en IntelliJ (carpeta del repositorio) y resuelve el examen.
6) Guarda cambios, realiza commits y sube tu rama:
   git add .
   git commit -m "Recuperación U2: solución"
   git push -u origin elieldavid-rodriguez-2c

## Estructura del proyecto
- src/Main.java
- src/Recovery2CService.java


## Problema
Construye un programa de consola para registrar solicitudes de préstamo de equipo (laboratorio) y generar un resumen.

El programa opera por ciclos y se detiene cuando el usuario escriba FIN como código de solicitud.

### Entrada por solicitud
En cada iteración solicita:
1) Código de solicitud (String). Si es FIN (sin importar mayúsculas), termina el ciclo y muestra el resumen final.
2) Categoría (int): 1) Laptop  2) Proyector  3) Kit Arduino  4) Cableado
3) Horas solicitadas (int)

### Validaciones obligatorias
A) Código:
- No puede ser null ni estar vacío/en blanco.
- Debe tener exactamente 7 caracteres.
Si falla: imprimir "Código inválido" y usar continue.

B) Categoría:
- Debe ser entero (usar hasNextInt). Si no es entero: imprimir "Categoría inválida" y terminar con return.
- Debe ser 1, 2, 3 o 4. Si no lo es: imprimir "Categoría inválida" y usar continue.

C) Horas:
- Debe ser entero (usar hasNextInt). Si no es entero: imprimir "Horas inválidas" y terminar con return.
- Debe estar entre 1 y 12. Si no cumple: imprimir "Horas inválidas" y usar continue.

### Reglas de negocio
- Si la categoría es Laptop (1) y horas > 8: imprimir "REQUIERE AUTORIZACIÓN" y terminar el ciclo con break.
- En cualquier solicitud válida, clasifica la prioridad:
  - BAJA si horas <= 3
  - MEDIA si 4..7
  - ALTA si > 7

### Resumen final
Al finalizar (por FIN o por break), imprime:
- totalSolicitudesValidas
- totalLaptop, totalProyector, totalArduino, totalCableado
- totalBaja, totalMedia, totalAlta
- promedioHoras (2 decimales) usando solo acumuladores (sin arreglos)

## Métodos obligatorios (en Recovery2CService)
Implementa estos métodos static:
- boolean esCodigoValido(String codigo)
- boolean esCategoriaValida(int categoria)
- boolean esHoraValida(int horas)
- String clasificarPrioridad(int horas)
- boolean requiereAutorizacion(int categoria, int horas)
