# Ejercicio 1 de autoevaluación: desempeño git básico

## Descripción

El objetivo de este ejercicio es que realice una autoevaluación de sus conocimientos de git. Para ello, se le propone la realización de una serie de tareas en las que debe manejar comandos elementales de git. El resultado de las actividades propuestas debe estar reflejado en un repositorio público en GitHub. En EV se pone a su disponibilidad la herramienta **gitAsseser**, que permite verificar si su repositorio público tiene la estructura esperada tras la realización de este ejercicio. Esta realimentación tiene el objetivo de que realice una autoevaluación de su manejo de git. Puede repetir el proceso tantas veces como necesite.

## Instrucciones

1. Realice en su espacio de GitHub un fork del repositorio `https://github.com/MIT-FS/Ejercicio1`
2. Clone su fork y realice el resto del ejercicio localmente.
3. Importe el proyecto gradle en eclipse.
4. Cree una rama cuyo nombre sea su uvus (a partir de ahora rama `<uvus>`) y que parta de la última versión de la rama `main`.
5. En la rama `<uvus>` modifique el fichero `Control.java`, que está localizada en el paquete `us.dit`, incluya el siguiente fragmento de código:

```java
package us.dit;

public class Control {

    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina"));
    }

    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }
}
```

6. Ejecute la clase `Control.java` para comprobar su funcionamiento.
7. Cree una nueva versión en la rama `<uvus>` que incluya los cambios efectuados en `Control.java`. El mensaje debe ser exactamente **"My assigned code"**
8. Etiquete esta versión como `first_tag`
9. En la rama principal, añada una cabecera (en formato comentario java) con su nombre y apellidos al fichero `Control.java`.
10. Cree una versión en esta rama que incluya este cambio. El mensaje debe ser exactamente **"Head added"**.
11. Fusione la rama `<uvus>` en la principal, manteniendo los cambios efectuados en ambas ramas en la versión resultante. El código debe ejecutarse sin errores tras efectuar la fusión.
12. Añada la etiqueta `"merge"` en la versión que acaba de crear.
13. Sincronice su fork de GitHub con su repositorio local, asegúrese de subir **TODO**: el histórico y las etiquetas.
14. En la herramienta de verificación gitAsseser edite el JSON que se le presenta sustituyendo el valor de los campos de tipo "value" de forma adecuada.    
    *   En el elemento con nombre “Repositorio consultado” e id “repo.name” debe indicar su repositorio (idealmente su espacio de github debería ser su uvus y el nombre del fork coincidir con el del repo principal)
    * En todos los demás elementos debe indicar su uvus.
     **SEA CUIDADOSO Y NO SE EQUIVOQUE, SI LOS VALORES NO COINCIDEN CON LO ESPERADO LA VERIFICACIÓN NO SE REALIZARÁ CORRECTAMENTE**

### Ejemplo

Si su uvus fuera **ABC123**, el JSON de entrada quedaría de la siguiente forma (el uvus se ha resaltado en negrita con un fin ilustrativo):

```json
[
    {
        "modelId": "repo.name",
        "name": "Repositorio consultado",
        "value": " ABC123/ Ejercicio1"
    },
    {
        "modelId": "user",
        "name": "uvus",
        "value": " ABC123"
    },
    {
        "modelId": "branch.name",
        "name": "Rama origen",
        "value": " ABC123"
    },
    {
        "modelId": "branch.name",
        "name": "Rama esperada",
        "value": " ABC123"
    },
    {
        "modelId": "branch.name",
        "name": "Rama del commit",
        "value": "ABC123"
    }
]
```
