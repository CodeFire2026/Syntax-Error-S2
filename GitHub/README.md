# 💻 SYNTAX ERROR

## 📚 COMANDOS Y TIPS DE GIT

> Guía de comandos y conceptos de Bash y Git vistos y utilizados en clase.

---

## 📑 ÍNDICE

- 🖥️ Las bases de Bash (CLIs)
- ⚙️ Configuración e información de Git
- 🔄 Día a día con Git
- 🧰 Misceláneos a saber

---

> ⚠️ **IMPORTANTE**
>
> Cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre, comando o aclaración sin incluir las flechas, a menos que se indique lo contrario.
>
> Si hay comillas `" "` en el comando es porque sí deben incluirse. Si no funciona, probar sin comillas.

---

# 🖥️ LAS BASES DE BASH (CLIs)

### ⌨️ `Tab`

Permite autocompletar nombres de archivos, directorios, comandos e incluso opciones.

---

### ⬆️⬇️ `↑` o `↓`

Permite volver a usar rápidamente comandos previamente ingresados.

---

### 📍 `pwd`

**IMPRIMIR DIRECTORIO DE TRABAJO**

Nos muestra por consola el directorio en el que estamos situados.

```bash
pwd
```

---

### 📂 `cd`

**CAMBIAR DIRECTORIO**

Permite movernos de directorio.

Se puede ingresar el comando sin nada:

```bash
cd
```

Esto permite ir directamente a la dirección `~` ("virgulilla"), por defecto:

```text
C:/users/tu_usuario/
```

También se puede ingresar un nombre o ruta completa del directorio:

```bash
cd tecnicatura2026/
```

---

### 📁 `mkdir`

**MAKE DIRECTORY**

Crea un directorio con el nombre que le siga al comando.

```bash
mkdir tecnicatura2026
```

---

### 🧹 `clear`

Limpia la consola.

```bash
clear
```

---

### 📄 `touch`

Crea un archivo con el nombre y extensión que le siga al comando.

```bash
touch readme.txt
```

Solo crea el archivo si no existe. Si ya existe, entonces no se crea ni se sobreescribe nada.

---

### 📍 `.`

Un solo punto quiere decir:

> **"El directorio actual".**

Ejemplo:

```bash
cd .
```

Nos mueve a la carpeta actual, básicamente no nos movemos.

No solo aplica para `cd`, sino para cualquier caso donde se requiera una ruta.

---

### 📍 `..`

Dos puntos quiere decir:

> **"El directorio anterior".**

Ejemplo:

```bash
cd ..
```

Nos moverá a la carpeta anterior a la que estemos parados.

No solo aplica para `cd`, sino para cualquier caso donde se requiera indicar una ruta.

---

### 📖 `cat`

**CONCATENATE**

Muestra los contenidos de un archivo dado como argumento.

Ejemplo:

```bash
cat usuarios.txt
```

Mostrará por pantalla los caracteres que contienen ese archivo.

---

### ❓ `--help`

Opción universal para la mayoría de comandos.

Devuelve instrucciones de uso, opciones e información sobre el comando que se haya indicado.

Ejemplo:

```bash
mkdir --help
```

Mostrará información detallada del comando `mkdir`.

También:

```bash
rm --help
```

Mostrará información del comando `rm`.

---

### 📋 `ls`

**LIST**

Muestra por pantalla todos los archivos y directorios de la ruta actual al ingresar el comando solo.

También se le puede pasar una ruta completa y mostrar su contenido.

Ejemplo:

```bash
ls tecnicatura2026/2do_Semestre/python/Clase5
```

La consola mostrará todos los ejercicios de la clase 5.

---

### 🕘 `history`

Muestra el historial completo de los comandos que hemos utilizado previamente en la consola.

Son los comandos a los que podemos acceder con la flecha arriba `↑`.

---

### 🗑️ `rm`

**REMOVE**

Borra de forma permanente el archivo que se le ingresa como argumento.

Ejemplo:

```bash
rm archivo.txt
```

Esto borraría sin vuelta atrás a `archivo.txt`.

La opción `-r` permite borrar directorios.

---

# ⚙️ CONFIGURACIÓN E INFORMACIÓN DE GIT

### ⚙️ `git config`

Sirve para obtener y establecer variables de configuración que controlan el funcionamiento, la apariencia y el comportamiento de Git.

Principalmente para establecer:

- Nombre
- Correo electrónico

---

### 🔐 `ssh-keygen -t ed25519 -C "<email>"`

Permite generar una clave SSH guardándola por defecto en una carpeta oculta llamada `.ssh` en `~`.

Esto se combina con el script para iniciar el agente al abrir Bash.

El nombre del archivo por defecto depende del algoritmo. En este caso sería:

```text
id_ed25519
```

Al crear la clave te pedirá dónde guardarla.

Presionar `Enter` para dejarla por defecto.

También preguntará por una contraseña y otra vez para confirmarla.

Esto se puede dejar en blanco si se quiere.

---

### 💾 `df`

**DISK FREE**

Muestra por pantalla la dirección y el disco donde está instalado Git, cuánto espacio consume en nuestro disco, cuánto hay disponible y cuánto consume en porcentaje.

---

# 🔄 DÍA A DÍA CON GIT

### 🧩 `git <subcomando>`

Nombre del ejecutable:

```text
git.exe
```

Con éste podemos acceder a todas las funciones de Git.

Por ejemplo:

```bash
git status
git push
git pull
git commit
```

---

### 🚀 `git init`

**GIT INITIALIZE**

Crea un repositorio Git, una carpeta oculta llamada `.git`, en la carpeta en la que estamos parados.

La ubicación actual se puede comprobar con:

```bash
pwd
```

---

### 📥 `git clone <https-url/clave-ssh>`

Permite descargar y copiar un repositorio remoto a tu espacio local.

```bash
git clone <https-url/clave-ssh>
```

La carpeta con los archivos se creará en la carpeta en la que estés parado.

---

### 🔗 `git remote`

Por sí solo, muestra los nombres de los remotos a los que estamos conectados.

Por ejemplo, lo básico es que al ingresar:

```bash
git remote
```

imprima:

```text
origin
```

---

### ⬇️ `git pull`

Descarga e integra de inmediato los cambios remotos a tu espacio local.

Es técnicamente la combinación de:

```bash
git fetch
git merge
```

Este comando requiere que hayas ingresado:

```bash
git push -u origin <nombre-de-rama>
```

antes, o sino dará error ya que no sabe de dónde sacar los cambios.

Si no quieres usar `-u`, siempre puedes especificar manualmente de dónde sacar los cambios:

```bash
git pull origin <nombre-de-rama>
```

---

### 📡 `git fetch`

Se usa para descargar solamente el historial más reciente del servidor.

No hace cambios inmediatos a tu zona de trabajo.

Permite revisar los cambios o ramas nuevas que se han hecho antes de integrarlos localmente.

A diferencia de `git pull`, que intenta fusionar automáticamente.

---

### 🔍 `git status`

Muestra los cambios hechos en el área de trabajo, los cambios añadidos al área de preparación y qué archivos son nuevos y todavía no trackeados.

Todo en el repositorio actual.

```bash
git status
```

---

### 🚫 `git ignore`

Permite ignorar archivos pasados como argumentos.

Ejemplo:

```bash
git ignore archivo.py
```

---

### ➕ `git add`

Agrega un archivo al área de preparación.

Puede usar un punto `.` para indicar que todo lo que se encuentra en el directorio actual sea agregado al área de preparación.

Ejemplo:

```bash
git add .
```

Si estamos parados en el directorio:

```text
python/
```

y ejecutamos:

```bash
git add .
```

esto agregará todos los archivos y cambios hechos en `python/` al área de preparación, listos para ser comprometidos.

---

### ↩️ `git restore`

Lo opuesto a `add`.

Revierte los cambios hechos a un archivo/directorio para que vuelvan a estar como estaban en el commit más reciente.

---

### 💾 `git commit`

Toma todos los cambios que hay en el área de preparación, los que fueron añadidos con `git add`, y los graba permanentemente en el historial del repositorio actual.

Si no se ingresa ninguna opción, se abrirá el editor de texto que tengas, que puede ser `vim` o `nano`, para escribir el mensaje de commit.

---

### ⬆️ `git push`

Se usa para subir los cambios locales al repositorio remoto vinculado.

Para el primer push se debe indicar la rama:

```bash
git push -u origin <rama>
```

`origin` se establece automáticamente con `git clone` o lo estableces manualmente con `git remote`.

La opción `-u` permite establecer la vinculación.

> ⚠️ **ADVERTENCIA**
>
> La rama que le indicamos se vinculará con la rama en la que estamos parados.
>
> Asegúrese de que la rama local y la rama remota sean las que quiera que se vinculen.

---

### 🏷️ `git tag <version> <hash-del-commit>`

Permite crear punteros en el historial de confirmaciones.

Ejemplo:

```bash
git tag v1.0 <hash>
```

---

### 📜 `git log`

Muestra todos los hechos de confirmaciones para el repositorio actual.

También se le puede especificar un archivo:

```bash
git log archivo.txt
```

para ver el historial de confirmaciones para ese archivo.

---

# 🌿 RAMAS

### 🌱 `git branch`

Sirve para ver las ramas existentes y en cuál estamos parados.

```bash
git branch
```

---

### 🔀 `git checkout`

Principalmente se usa para cambiar de rama.

Aunque también puede:

- Crear nuevas ramas.
- Restaurar archivos a una versión anterior.
- Ir a una versión de un commit específico.
- Ir al commit anterior.

---

### 🔄 `git switch <nombre-de-rama>`

Sirve para cambiar entre ramas.

Es similar a `checkout`, pero menos ambiguo y más seguro.

Se recomienda usarlo junto con `git restore` si se desea imitar las funciones de `checkout`.

---

### 🔀 `git merge <nombre-de-rama-fuente>`

Sirve para fusionar dos ramas distintas.

Para esto primero hay que pararse en la rama que va a recibir los cambios.

Ejemplo:

```bash
git switch main
git merge second
```

Esto resultaría en los cambios de `second` aplicándose a `main`.

---

# ↩️ DESHACER CAMBIOS

### ⏪ `git reset <hash-de-commit>`

Sirve para volver en el tiempo y "borrar" commits.

Sería como un deshacer forzoso.

> ⚠️ **CUIDADO**
>
> Es recomendable tener cuidado al utilizar este comando.

Se puede utilizar `git revert` como una opción más segura y amigable cuando se trabaja en grupo.

También se puede indicar el nombre de un archivo en vez de un hash.

Esto hará que el archivo sea eliminado del área de preparación.

Aunque es preferible usar:

```bash
git restore --staged
```

---

### ↩️ `git revert <hash-de-commit-deseado>`

Revierte los cambios creando un nuevo compromiso, en lugar de volver en el tiempo.

Ideal para ramas compartidas con equipos y preferible antes de usar `reset`.

---

### 📦 `git stash`

Útil para guardar temporalmente los cambios no confirmados.

Puede guardar cambios staged o no staged.

Permite trabajar en otras ramas o realizar una tarea de emergencia.

---

### 🗑️ `git rm <nombre-archivo>`

**GIT REMOVE**

Elimina el área de preparación y también el `worktree` al archivo pasado como argumento.

```bash
git rm <nombre-archivo>
```

---

# 🧰 MISCELÁNEOS A SABER

### 💻 `code`

Abre Visual Studio Code.

Se le puede indicar qué abrir.

Para abrir la carpeta actual:

```bash
code .
```

Para abrir un archivo en particular:

```bash
code archivo.txt
```

---

### 🔎 `git show`

Por defecto sirve para visualizar detalles de las adiciones, modificaciones o eliminaciones en cada archivo que fue modificado, línea por línea, del último commit.

También sirve para ver detalles de cualquier objeto Git.

Por ejemplo, una etiqueta anotada:

```bash
git show <version>
```

---

### 📊 `git shortlog`

Muestra:

- El nombre del usuario.
- La cantidad de commits al lado de su nombre.
- Una lista de solo los mensajes de los commits.

---

# 🔎 GIT DIFF

### `git diff`

Sirve para ver las diferencias línea por línea entre versiones, ya sea de commits, archivos o de lo que está en el área de preparación.

El comando solo, sin argumentos:

```bash
git diff
```

mostrará los cambios locales hechos que todavía no estén en escena.

Las líneas rojas indican lo que fue modificado o borrado.

Las líneas verdes indican lo que fue agregado.

---

## ⚙️ OPCIONES DE `git diff`

### `--stat`

Muestra de forma resumida los archivos modificados y cuáles fueron sus cambios en cada uno.

```bash
git diff --stat
```

---

### `--numstat`

Muestra de forma incluso más resumida los cambios de cada archivo que haya sido modificado.

Muestra solamente:

- Líneas agregadas a la izquierda.
- Líneas eliminadas a la derecha.

```bash
git diff --numstat
```

---

### `--staged`

Muestra los cambios que entrarán en el próximo compromiso.

```bash
git diff --staged
```

---

### `<nombre_de_otra_rama>`

Muestra las diferencias entre la rama actual y la rama dada.

```bash
git diff <nombre_de_otra_rama>
```

Si ingresas el nombre de la rama actual, simplemente mostrará los cambios locales hechos, si es que hay.

---

### `<nombre-rama-1>..<nombre-rama-2>`

Muestra qué tiene la rama 2 que no tiene la rama 1.

```bash
git diff <nombre-rama-1>..<nombre-rama-2>
```

---

### `<hash1> <hash2>`

Compara dos commits.

```bash
git diff <hash1> <hash2>
```

---

# 💻 SYNTAX ERROR

> **Git & Bash Cheat Sheet**
>
> `git` • `bash` • `github`
>
> **Aprender • Practicar • Crear**
