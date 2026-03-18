package Expresiones;

public class ExpresionesRegulares {
    /*
    . = Coincide con cualquier carácter, excepto nueva línea.

    ^ = Coincide si la expresión está al inicio de la línea.

    $ = Coincide si la expresión está al final de la línea.

    [abc] = Coincide con cualquiera de los caracteres dentro de los corchetes (a, b o c).

    [abc][12] = Coincide con dos caracteres consecutivos: el primero debe ser a, b o c, y el segundo 1 o 2.

    [^abc] = Coincide con cualquier carácter excepto a, b o c.

    [a-z1-9] = Coincide con cualquier letra mayúscula (a-z) o cualquier número excepto 0 (1-9)

    [a-z0-9] = Coincide con cualquier letra mayúscula (a-z) o cualquier número (0-9)

    A|B = Coincide con A OR B. El operador | actúa como un "O lógico" (OR) en expresiones regulares.

    \d = Coincide con cualquier dígito (0-9).

    \D = Coincide con cualquier carácter que NO sea un dígito.

    \s = Coincide con cualquier espacio en blanco, incluyendo espacios, tabulaciones y saltos de línea.

    \S = Coincide con cualquier carácter que NO sea un espacio en blanco.

    \w = Coincide con cualquier carácter alfanumérico (a-z, A-Z, 0-9, _).

    \W = Coincide con cualquier carácter que NO sea alfanumérico.

    \b = Coincide con un límite de palabras (inicio o final de una palabra).

    * = Coincide con cero o más repeticiones del carácter o grupo anterior.

    ? = Coincide con cero o una repetición del carácter o grupo anterior (opcional).




    Ejemplos:
    1. Comprueba si una cadena contiene solo números:
    ^[0-9]+$

    2. Valida que una cadena tenga exactamente 5 letras minúsculas:
    ^[a-z]{5}$

    3. Comprueba si una contraseña tiene al menos 8 caracteres:
    ^.{8,}$

    4. Valida una matrícula española (4 números y 3 letras):
    ^[0-9]{4}[A-Z]{3}$
    Si quieres permitir minúsculas también:
    ^[0-9]{4}[A-Za-z]{3}$

    5. Comprueba si una cadena empieza por “DAM”:
    ^DAM

    6. Detecta si una frase contiene algún número:
    [0-9]

    7. Dado un array de DNIs, muestra sólo los válidos:
    ^[0-9]{8}[A-Za-z]$

    8. Dado un array de palabras, cuenta cuántas son sólo letras:
    ^[A-Za-zÁÉÍÓÚÜÑáéíóúüñ]+$

     */
}
