# Java-04-Strings

<ol>
  <li>
    Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:
    <ol type="a">
      <li>
        Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
      </li>
      <li>
        Decir si en la cadena aparece el carácter ‘x’.
      </li>
      <li>
        Decir si la cadena tiene más de 10 posiciones.
      </li>
      <li>
        Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
      </li>
      <li>
        Crear una cadena formada por las 5 primeras posiciones de la cadena.
      </li>
      <li>
        Crear una cadena formada por las 5 últimas posiciones de la cadena.
      </li>
      <li>
        Decir si la cadena es igual a la cadena “hola”.
      </li>
      <li>
        Convertir la cadena a un número entero (puede ser negativo o positivo).
      </li>
      <li>
        Convertir la cadena a un número hexadecimal.
      </li>
      <li>
        Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
      </li>
      <li>
        Decir si la primera posición de la cadena es igual a la última.
      </li>
      <li>
        Decir cuántos dígitos numéricos hay en la cadena.
      </li>
      <li>
        Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
      </li>
      <li>
        Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
      </li>
    </ol>
    
  </li>
  <li>
    Diseña un algoritmo capaz de obtener la letra del nif a partir del número de dni.
    Consiste en dividir dicho número entre 23 y tomar el resto de la división asignándole la
    letra correspondiente según la siguiente tabla. Almacena las letras del NIF en una cadena.
  </li>
  <table>
      <tr>
        <td>
          RESTO
        </td>
        <td>0
        </td>
        <td>
        1
        </td>
        <td>2
        </td>
        <td>
        3
        </td>
        <td>
        4
        </td>
        <td>
        5
        </td>
        <td>6
        </td>
        <td>7
        </td>
        <td>8
        </td>
        <td>9
        </td>
        <td>10
        </td>
        <td>11
        </td>
        <td>12
        </td>
        <td>13
        </td>
        <td>14
        </td>
        <td>15
        </td>
        <td>16
        </td>
        <td>17
        </td>
        <td>18
        </td>
        <td>19
        </td>
        <td>20
        </td>
        <td>21
        </td>
        <td>22
        </td>
      </tr>
      <tr>
        <td>
        LETRA
        </td>
        <td>
        T
        </td>
        <td>R
        </td>
        <td>
        W
        </td>
        <td>
        A
        </td>
        <td>
        G
        </td>
        <td>M
        </td>
        <td>Y
        </td>
        <td>F
        </td>
        <td>P
        </td>
        <td>D
        </td>
        <td>X
        </td>
        <td>B
        </td>
        <td>N
        </td>
        <td>J
        </td>
        <td>Z
        </td>
        <td>S
        </td>
        <td>Q
        </td>
        <td>V
        </td>
        <td>H
        </td>
        <td>L
        </td>
        <td>C
        </td>
        <td>K
        </td>
        <td>
        E
        </td>
      </tr>
    </table>
  <li>
    Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos muestre cuantas veces está contenido el carácter en la cadena.
  </li>
  <li>
    Realiza un programa que muestre una contraseña generada aleatoriamente teniendo
    las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre
    la ‘a’ y la ‘j’.
  </li>
  <li>
    Realiza un programa que muestre una contraseña generada aleatoriamente teniendo
    las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre
    la ‘a’ y la ‘j’ pero sin letras repetidas.
  </li>
  <li>
    Realiza un programa al que se le introduzca un email y nos devuelva el nombre del
    dominio y subdominios si los hubiese, es decir, lo que está entre la arroba y el punto final
    (Ejemplo: info@empresas.clientes.mundo-r.com mostraría empresas.clientes.mundo-r ).
  </li>
  <li>
    Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra
    por otra a lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M.
    Obviamente si la A pasa a ser F, ninguna otra letra pasará F. Hacer un programa que le
    introduzca una cadena en mayúsculas y muestre la cadena encriptada en (todo lo que no
    sean letras mayúsculas se deja intacto: números, espacios en blanco, etc.). Hacer una
    segunda versión que funcione con mayúsculas y minúsculas.
  </li>
  <li>
    Realizar un programa que solicite una cadena, un número que indica una posición de
    la cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que
    hubiera en la posición indicada por la letra introducida. Hacer dos versiones, la primera con
    String y otra con StringBuilder.
  </li>
  <li>
    Escribe un programa que solicite que se introduzca por teclado un nombre completo
    y una edad y muestre el siguiente mensaje, utilizando la clase Format.
    <h6>Hola, me llamo Pepe Pérez López y tengo 20 años</h6>
    suponiendo que se introduce Pepe Pérez López como nombre completo y 20 como edad.
  </li>
  <li>
    Realizar un programa que solicite la entrada de 10 cadenas de caracteres y
    construya una cadena con el primer carácter de cada cadena. Finalmente mostrará dicha
    cadena por pantalla.
  </li>
  <li>
    Describe que realiza el código siguiente e indica si contiene algún error.
  </li>
  
  ```java
  java.util.Scanner teclado = new java.util.Scanner(System.in);
  System.out.println("Introduce una cadena:");
  String cadena = teclado.nextLine();
  StringBuilder cadenaSB = new StringBuilder(cadena);
  int pos;
  do {
    pos = cadenaSB.indexOf(" ");
    if (pos!=-1) cadenaSB.deleteCharAt(pos);
  } while (pos != -1);
  System.out.println(cadenaSB);
  ```
  <li>
    Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que
    todas sean dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá
    introducirla de nuevo hasta que lo haga correctamente.
  </li>
  <li>
    Realizar un programa al que se le introduzca un número decimal y lo convierta a un
    String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar
    las clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para
    convertir de decimal a hexadecimal.
  </li>
  <li>
    Realizar un programa al que se le introduzca una cadena por teclado, que la
    convierta a StringBuilder, y aplicando métodos de esa clase, haga lo siguiente:
  </li>
  <ol type="a">
      <li>
        Borrar el carácter que haya en la posición 3.
      </li>
      <li>
        Insertar una ‘x’ en la posición 5.
      </li>
      <li>
        Sustituir el carácter de la posición 1 por una ‘z’.
      </li>
      <li>
        Borrar los caracteres entre la posición 5 y 10.
      </li>
      <li>
        Darles la vuelta a todos los caracteres del StringBuilder.
      </li>
      <li>
        Convertir el StringBuilder en cadena.
      </li>
    </ol>
  <li>
    Realizar un programa en el que el usuario introduzca un texto y sustituya sus
    posiciones impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares
    pasaría a: “a*c*e*g”
  </li>
</ol>
