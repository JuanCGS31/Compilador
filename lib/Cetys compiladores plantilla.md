# Título del Proyecto
Compilador que traductor de C en español a ingles
## Resumen
El compilador recibe un codigo en español, en el proceso de la compilacion los valores resevados y demas procesos dentro del codigo se traducen al ingles (de la forma en la que el lenguaje fue creado).

## Motivación y Problema a Resolver
- Descripción del problema: La mayoria de los lenguajes convencionales estan escritos en ingles, por ello no todas las personas conocen el lenguaje y esto les puede ayudar a trabajar de forma colaborativa cuando se necesite con personas que no conocen el idioma.
- Importancia: El proceso de multilinguismo genera una mayor apertura a conocer y comprender la programacion para personas no nativas del ingles. 
- Casos de uso: Los trabajos colaborativos entre hablantes del ingles y del español, como una forma de facilitar el entendimiento.

## Objetivos del Proyecto
- Objetivo 1: Convertir codigo de español a ingles
- Objetivo 2: Crear el compilador de forma funcional
- Objetivo 3: Comprender como funciona un lenguaje de programación 
- Objetivo 4: Aprender mas sobre los proceso interno de la compleja actividad que es programar

## Revisión del Estado del Arte
- Compiladores similares: Forma de trabajar de PSeint
- Limitaciones de soluciones actuales: Comprencion de los lenguajes y falta de informacion especifica
- Justificación del nuevo compilador: Mejora comunicativa en proceso bilinguisticos en ambientes de trabajo

## Arquitectura y Diseño del Compilador
- Diagrama de bloques: Se eliminan los espacios, se analiza el lexico, se tokeniza y se atrapa si se tiene errores, se analiza la semantica usando los tokens, creando un arbol sintactico y aportando a la tabla de simbolos, se analisa la cemantica crando otro arbol sintactico y aportando a la tabla de simbolos, se optimiza y da el resultado con la converción.
- Explicación del flujo de datos: El programador programa en español, el compilador procesa el codigo tomando las palabras clave conviertiendolas de español a ingles.
- Decisiones de diseño: Se tendra para el proceso una interface para facilitar el proceso y como parte fundamental se tradujeron las palabras recervadas de ingles a español.

## Análisis Léxico
- **Análisis léxico:** 
auto = auto
break = corte
case = caso
char = caracter
const = constante
continue = continuar
default = defecto
do = hacer
double = doble
else = sino
enum = enumerar
extern = externo
float = flotante
for = para
if = si
int = entero
long = largo
register = registrar
retun = regresar
short = corto
sinal = consigno
sizeof = tamañode
static = estatico
struct = estructura
switch = opciones
typedef = redefinir
union = union
unsigned = sinsigno
void = vacio
volatile = volatil
while = mientras
_Packed = _Empaquetado

- Simbolos: -,~,!,*,&,_Alignof,sizeof,+,++,--,/,%,<<,>>,<,>,<=,>=,==,!=,|,^,&&,||,= y ,

## Análisis Sintáctico

- **Análisis sintáctico:** 
  - Uso de gramáticas y árboles sintácticos.

- **Ejemplos:**

## Análisis Semántico

- **Análisis sintáctico:** 
  - Uso de gramáticas y árboles sintácticos.

- **Ejemplos:**

## Pruebas y Validación

- **Metodología de pruebas:**
- **Resultados obtenidos:**
- **Casos de prueba específicos:**

## Herramientas y Entorno de Desarrollo
- **Lenguajes de programación utilizados:**
- **Herramientas de desarrollo:**
- **Entorno de pruebas y simulación:**

## Demostración
- **Ejemplo de código fuente:**
- **Proceso de compilación:**
- **Ejecución del código compilado:**

## Desafíos y Soluciones
- **Problemas técnicos o de diseño:**
- **Estrategias adoptadas para superar desafíos:**
- **Lecciones aprendidas:**

## Conclusiones y Trabajo Futuro
- **Resumen de objetivos cumplidos:**
- **Evaluación del desempeño:**
- **Propuestas para mejoras futuras:**

## Preguntas y Discusión
- Espacio para responder preguntas y discusión sobre el proyecto.

## Referencias
- **Fuentes citadas:** Lista de libros, artículos, papers, y otras fuentes relevantes.