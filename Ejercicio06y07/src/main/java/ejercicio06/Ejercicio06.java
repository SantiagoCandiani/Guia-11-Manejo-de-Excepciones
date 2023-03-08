/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
Se ejecutan: a1, a2, a3, a6 y a5.
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
Se ejecutan a1, a2, a3, a4, a5.
        class A {

            public void metodoA() {
                sentencia_a1;
                sentencia_a2;

                try {
                    sentencia_a3;
                    sentencia_a4;
                } catch (MioException e) {
                    sentencia_a6;
                }
                sentencia_a5;
            }
        }
RESPUESTAS:
a)El orden de ejecución completo del método metodoA de la clase A si se produce la excepción MioException es el siguiente:

    1- Ejecución de sentencia_a1.
    2- Ejecución de sentencia_a2.
    3- Inicio del bloque try.
    4- Ejecución de sentencia_a3 (ocurre MioException).
    5- Salto a la sentencia catch y ejecución de sentencia_a6.
    6- Fin del bloque try-catch.
    7- Ejecución de sentencia_a5.
    8- Fin del método.

B)El orden de ejecución completo del método metodoA de la clase A si NO se produce la excepción MioException es el siguiente:

    1- Ejecución de sentencia_a1.
    2- Ejecución de sentencia_a2.
    3- Inicio del bloque try.
    4- Ejecución de sentencia_a3.
    5- Ejecución de sentencia_a4.
    6- Fin del bloque try.
    7- Ejecución de sentencia_a5.
    8- Fin del método.
 */

