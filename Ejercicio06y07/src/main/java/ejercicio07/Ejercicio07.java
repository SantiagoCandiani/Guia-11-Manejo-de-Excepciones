/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
   class B {

        public void metodoB() {
            sentencia_b1
            try {
                sentencia_b2
            } catch (MioException e) {
                sentencia_b3
            } finally sentencia_b4
            }
        }

a)El orden de ejecución completo del método metodoB de la clase B si se produce la excepción MioException es el siguiente:

    1- Ejecución de sentencia_b1.
    2- Inicio del bloque try.
    3- Ejecución de sentencia_b2 (ocurre MioException).
    4- Salto a la sentencia catch y ejecución de sentencia_b3.
    5- Ejecución de sentencia_b4 (siempre se ejecuta, independientemente de si ocurre una excepción o no).
    6- Fin del bloque try-catch-finally.
    7- Fin del método.

b)El orden de ejecución completo del método metodoB de la clase B si NO se produce la excepción MioException es el siguiente:

    1- Ejecución de sentencia_b1.
    2- Inicio del bloque try.
    3- Ejecución de sentencia_b2.
    4- Fin del bloque try.
    5- Ejecución de sentencia_b4 (siempre se ejecuta, independientemente de si ocurre una excepción o no).
    6- Fin del método.
 */
