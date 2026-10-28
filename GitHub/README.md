# 💻 SYNTAX ERROR

## 📚 COMANDOS Y TIPS DE GIT

> Guía de comandos y conceptos de Bash y Git vistos y utilizados en clase.

---

## 📑 ÍNDICE

- 🖥️ Clase 1 - Uso de GitHub y Las bases de Bash (CLIs)
- 🗝️ Clase 2 - Clves SSH, Configuración e Información de Git
- ⚙️ Clase 3 - Git y GitHub (Sincronización)
- 🔄 Clase 4 - Primer Push y Área de Trabajo
- 🧰 Clase 5 - Git Tag y Versiones
- 🔄️ Clase 6 - Desacer Cambios y Correcciones
- 🔎 Clase 7 - Git Diff
- 🗂️ Clase 8 - Manejo de Ramas
- 📚 Clase 9 - Configurar multiples repositorios
- 📥 Clase 10 - Flujo de trabajo
- 📑 Clase 11 - Archivos Binarios
- ✨ Clase 12 - Ya hemos llegado al nivel más alto de GitHub


---

> ⚠️ **IMPORTANTE**
>
> Cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre, comando o aclaración sin incluir las flechas, a menos que se indique lo contrario.
>
> Si hay comillas `" "` en el comando es porque sí deben incluirse. Si no funciona, probar sin comillas.

---

# 🖥️ Clase 1 - Uso de GitHub y Las bases de Bash (CLIs)

### 🐙 `Que es GitHub`

**GitHub** es una plataforma que nos permite almacenar repositorios de `Git` y utilizarlos como servidores remotos.
También ofrece una interfaz visual e interactiva que permite hacer varias tareas sin depender siempre de la terminal.

Entre las cosas que se puden hacer en GitHub están:

    📁 Crear repositorios o importarlos.

    👥 Armar organizaciones.

    📊 Gestionar proyectos.

    🔎 Explorar repositorios de otras personas.

    🤝 Participar en proyectos ajenos.

    ⭐ Marcar repositorios con estrellas.

    🌎 Difundir nuestros propios proyectos.

---

### 🛠️ Opciones principales de GitHub

    Opción:                             Descripción:

    .Importacion de Repositorios        Traer un repositorio que ya existe
    .Nuevo Repositorio                  Armar un repositorio desde cero
    .Nueva Organización                 Armar un grupo para reunir proyectos y personas
    .Nuevo Projecto                     Armar un espacio para ordenar tareas y proyectos
    .Nuevo Gist                         Compartir fragmetos pequeños de código

---

### 📦 Crear un repositorio

Para crear un repositorio hay que elegir:

`Nuevo Repositorio`

Despues se le asigna un nombre, por ejemplo:

```bash
Prueba-Inicio-Repo
```

Tambien se puede sumar: 

    📝 Una descripción.

    🔒 Definir si será público o privado.

    📄 Un archivo README.

    ⚖️ Una licencia.

    🚫 Un archivo < .gitignore >

Y por último:

`Crear Repositorio`

---

### 📄 README.md

El archivo **Readme.md** es lo primero que GitHub muestra al entrar a un repositorio.

Es recomendable usarlo para dejar en claro:

    📌 De qué se trata el proyecto.

    🛠️ Con qué herramientas está hecho.

    📋 Qué hace falta para usarlo.

    ▶️ Cómo ponerlo en marcha.

    🤝 Cómo sumar cambios.

    👨‍💻 Quiénes forman parte.

```bash
[!Tip]

El README cumple el rol de "Carta de presentación del Proyecto".
```

---

### 🔐 HTTPS, SSH y GITHUB CLI

GitHub permite la conexión mediante dos vías principales:

    Metodo:                  Ejemplo:

    HTTPS                    https://github.com/CodeFire2026/Syntax-Error-S2.git

    SSH                      git@github.com:CodeFire2026/Syntax-Error-S2.git

    GitHub CLI               gh repo clone CodeFire2026/Syntax-Error-S2

Hoy en día GitHub no acepta la contraseña comun de la cuenta para autenticar operaciones Git por HTTPS.

En el caso de **HTTPS** se suele usar **tokens** de acceso personal, mietras que **SSH** se apoya en un par de clases: Una **Publica** y una **Privada** y en GitHub CLI es una herramienta oficial de GitHub usa sus funciones desde la terminal. Se relaciona con HTTPS y SSH porque en `gh auth login` se elige HTTPS o SST como protocolo de Git; si se opta por HTTPS y se acepta autenticar Git con las crecdenciales de GitHub, `gh` guarda esas credenciales automaticamente y evita tener que configurarlas o ingresarlas manuelamente.

---

### 🔗 Conectar un repositorio de GitHub con nuestra computadora

Una manera práctica de trabajar es crear el repositorio primero en GitHub y después clonarlo en la computadora.

**`1️⃣ Crear el repositorio en GitHub`**

Primero se crea el repositorio desde la página de GitHub.

**`2️⃣ Copiar el enlace HTTPS o SSH`**

Ejemplo:

```bash
< https://github.com/CodeFire2026/Syntax-Error-S2.git > o < git@github.com:CodeFire2026/Syntax-Error-S2.git >
```

**`3️⃣ Abrir Git Bash`**

Nos ubicamos en la carpeta donde queremos guardar los proyectos.

```bash
<cd Documentos>
```

Creamos una carpeta

```bash
<mkdir "Proyecto">
```

Entramos 

```bash
<cd "Proyecto">
```

**`4️⃣ Clonar el repositorio`**


```bash
<git clone https://github.com/CodeFire2026/Syntax-Error-S2.git>
```

Entramos al repositorio:

```bash
<cd Syntax-Error-S2>
```

**`🔄 Actualizar el repositorio`**

```bash
<git pull origin main>
```

Tambien se puede consultar la información del servidor remoto:

```bash
<git fetch>
```

Ver las ramas:

```bash
<git branch>
```
<p>


> ⚠️ **IMPORTANTE**
>
> Cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre, comando o aclaración sin incluir las flechas, a menos que se indique lo contrario.
>
> Si hay comillas `" "` en el comando es porque sí deben incluirse. Si no funciona, probar sin comillas.
<p>

---

### 📝 Crear un README desde Git Bash

```bash
<touch README.md>
```

Luego se puede revisar el estado:

```bash
<git status>
```

Agregar los archivos

```bash
< git add . >
```

Creamos el commit

```bash
<git commit -m "Creamos el Readme">
```

Vemos el historial (comprobamos si se creo correctamente el commit)

```bash
<git log>
```

Y por último subimos los cambios

```bash
<git push origin main>
```
<p>

> ⚠️ **IMPORTANTE**
>
> Cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre, comando o aclaración sin incluir las flechas, a menos que se indique lo contrario.
>
> Si hay comillas `" "` en el comando es porque sí deben incluirse. Si no funciona, probar sin comillas.
<p>

---

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

# 🗝️ Clase 2 - Clves SSH, Configuración e Información de Git

### 🔐 ¿Qué es una clave SSH?

Las claves SSH sirven para establecer una conexión segura entre la computadora y GitHub.

Por lo general se trabaja con dos archivos:

```bash
    Clave Privada

    Clave Publica (.pub)
```

**⚠️ !Precaución**

    La clave privada "JAMÁS" debe compartirse.

---

### 📤 Cargar una clave SSH pública en GitHub

    [!Nota]
    Si este proceso ya se hizo antes en el equipo, en general no hace falta repetirlo.
<p>

`1️⃣ Buscar la clave pública`
Entramos a la carpeta:

```bash
.ssh
```

Buscamos un archivo que termine en:

```bash
.pub
```

Por ejemplo:

```bash
id_ed25519.pub
```

Abrimos el archivo y copiamos todo lo que contiene.
<p>

`2️⃣ Agregarla en GitHub`

Dentro de GitHub vamos a: 

```bash
Settings
    ↓
SSH and GPS keys
    ↓
New SSH key
```

Le ponemos un nombre que identifique al dispositivo y pegamos la clave pública.

    💡 Conviene usar como nombre de la clave el nombre de la computadora con la que estamos trabajando.

Por ejemplo:

```bash
Notebook-Jesus
```

Cada computadora puede tener su propia clave SSH.

### Comandos de Git

Ver ramas

```bash
<git branch>
```

Cambiar a una rama

```bash
<git branch>
```

Cambiar a una rama

```bash
<git checkout main o git switch main>
```

Renombrar **MASTER** o **MAIN**

```bash
<git branch -M main>
```

Conectar un repositorio remoto

```bash
<git remote add origin https://github.com/CodeFire2026/Syntax-Error-S2.git>
```

Ver los repositorios remotos configurados

```bash
<git remote -v>
```

Fusionar una rama

```bash
<git remote second>
```
[Esto extrae los cambio de la RAMA SECOND a la rama que estamos parado]

---

### `💾 Commit y Push`

Crear un commit de archivos ya reastrados

```bash
<git commit -am "Uso de GitHub 01">
```

Subir los archivos

```bash
<git push origin main>
```

[!Important]

<git commit -am> solo agrega automaticamente archivos que git ya venía siguiendo. Los archivos nuevos necesitan primero un <git add>.

---

### `🌳 ¿Qué pasa si tenemos master y main?`

Puede darse el caso de que existan dos ramas

```bash
master 
main
```

Si quieremos que `master` sea la principal

1. Entramos al repositorio en GitHub.

2. Vamos a Settings.

3. Buscamos la configuración de Branches.

4. Ponemos master como rama principal.

5. Revisamos que todo ande bien.

6. Después se puede borrar master si ya no hace falta.

---

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

### 🔗 `git remote`

Por sí solo, muestra los nombres de los remotos a los que estamos conectados. Lo básico es que al ingresar **git remote** imprima **origin**.

---

### 🌱 `git branch`

Sirve para ver las ramas existentes y en cuál estamos preparados.

```bash
git branch
```

---

### 🔀 `git checkout`

Principalmente se usa para cambiar de rama. Aunque también puede:

    . Crea nuevas ramas.

    . Restaurar archivos a una versión anterior.

    . Ir a una versión de un commit especifico.

    . Ir al commit anterior.

---

### 🔄 `git switch <nombre-de-rama>`

Sirve para cambiar entre ramas. Es similar a **checkout**, pero menos ambiguo y más seguro. Se recomienda usarlo justo con **git restore** si se desea imitar las funciones de **checkout**.

---

### 🔀 `git merge <nombre-de-rama-fuente>`

Sirve para fusionar dos ramas distintas. Para esto primero hay que prepararse en la rama que va a recibir los cambios.

Ejemplo:

```bash
git switch main
git merge second
```

Esto resultaría en los cambios de **second** aplicándose a **main**

---

# ⚙️ Clase 3 - Git y GitHub (Sincronización)

### `🌿 De "master" a "main"`

Antes, la mayoria de los repositorios de Git usaban **master** como nombre de la rama principal.

GitHub a usar **main** como nombre por defecto en los repositorios nuevos.

Por eso, según cómo se haya creado el repositorio y cómo esté configurado Git, puede aparecer cualquiera de los dos nombres.

---

### `❓ ¿Cuándo podemos encontrar "master" o "main"?`

**Repositorios creados localmente**

Al ejecutar **< git init >** el nombre inicial va a depender de cómo esté configurada la instalacion de Git.

Se puede cambiar a mano

```bash
<git branch -M main>
```

---

### `Configurar "main" como rama predeterminada`

Se le puede indicar a Git que los repositorios nuevos usen **main**

```bash
<git config --global init.defaultBranch main>
```

Desde ese momento, al usar **< git init >** Git va a tomar **main** como rama inical.

---

### `📊 Gitk`

Se puede ver el historial del repositorio de forma gráfica con

```bash
<gitk>
```

Gitk mostrara

    🌿 Ramas.
    
    🔀 Fusiones.
    
    💾 Commits.
    
    🏷️ Tags.
    
    📜 Historial del repositorio.

---

### `🐧 Instalar Gitk en Linux`

>[🛑 Dato importante: esos comando funcionan especificamente para sistemas Debian y sus derivados, para demas sistemas investigar el comando correspondiente]
```bash
<sudo apt-get update>
<sudo apt-get install gitk>
```

Luego 

```bash
<gitk>
```

---

### `🔄 Actualizar un repositorio local`

Cuando se trabaja en equipos o desde distintas computadoras hoy que mantener actualizado el repositorio local.

Esto ayuda a 

    Evitar conflictos.
    
    Trabajar con la última versión.
    
    Recibir cambios hechos por otras personas.
    
    Mantener las ramas sincronizadas.

**Flujo de trabajo**

```bash
<cd "nombre-del-repositorio">

<git switch "main">
<git pull origin main>

<git switch "second">
<git pull origin main>


<git switch "rama-personal">
<git merge second>
```

> ⚠️ **IMPORTANTE**
>
> Cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre, comando o aclaración sin incluir las flechas, a menos que se indique lo contrario.
>
> Si hay comillas `" "` en el comando es es porque se debe ingresar el nombre correspondiente no indica que deben de llevar si o si.

---

### `🔀 Fetch + Merge`

Primero se descargan las referencias remotas

```bash
<git fitch>
```

Despues se pueden integrar

```bash
<git switch main>
<git merch origin/main>
```

---

### `🧠 Diferencia rápida`

    Comando	            Función

    <git fetch> 	    Baja información del repositorio remoto sin fusionarla

    <git pull>	        Baja cambios e intenta integrarlos

    <git merge> 	    Une ramas

    <git push>	        Manda nuestros commits al repositorio remoto

---

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

# 🔄 Clase 4 - Primer Push y Área de Trabajo

### 🔐 `SSH y GitHub`

Las claves SSH se crean, por lo general, una sola vez por computadora.

Una vez generadas, se le entregan a GitHub la llave pública para poder comunicarse de forma segura y sin tener que autenticarse a mano en cada operación.

>!IMPORTANTE <p>
    >La única llave que se comparte con GitHub es la **llave pública**

---

### 🔑 `Agregar la clave SSH a GitHub`

Para eso hay que entrar en 

    GitHub
        ↓
    Settings
        ↓ 
    SSH and GPG keys
        ↓
    New SSH key

Despues

1. Se pone un nombre para identificar la computadora.

2. Se pega el contenido de la llave pública.

3. Se guarda la nueva llave SSH.

---

### 🔄 `Cambiar el remoto de HTTPS a SSH`

Si el repositorio ya estaba contectado con HTTOS, se puede cambiar la URL remota con

```bash
<git remote ser-url origin URL_SSH_DEL_REPO>
```
Se puede comprobar el cambio con:

```bash
<git remote -v>
```

---

### 📋 `Copiar la llave SSH pública`

🍎 macOS

```bash
<pbcopy < ~/.ssh/id_rsa.pub>
```

🪟 Windows — Git Bash

```bash
<clip < ~/.ssh/id_rsa.pub>
```

🐧 Linux — Ubuntu

```bash
<cat ~/.ssh/id_rsa.pub>
```

>[!Nota]: Si la clave se creo con Ed25519, el archivo podría llamarse
>
>id_ed25515.pub
>
>En ese caso, por ej:
>
><cat ~/.ssh/id_ed25519.pub>

---

### 📤 `Antes de hacer Push`

Cuando se trabaja en equipo conviene revisar que el repositorio local esté actualizado antes de subir los cambios.

Un flujo posible sería:

```bash
<git fetch>
<git pull origin main>
<git push origin main>
```

[!WARNING]
Si otra persona tocó los mismo archivos o líeas, pueden aparecer conflictos que habrá que resolver a mano

---

### 👥 `Invitar a un colaborador`

Para sumar a otra persona al repositorio hay que entrar en GitHub y buscar la configuración de colaboradores.

Un recorrido habitual es:

```bash
Repositorio
↓
Settings
↓
Collaborators
↓
Add people
```

[!NOTA]
GitHub puede volver a pedir la contraseña o algun metodo de autenticación de dos factores.

Después:

1. Se busca el nombre de usuario.

2. Se manda la invitación.

3. La persona invitada acepta.

4. Una vez aceptada, ya puede colaborar según los permisos que se le hayan dado.

---

### 🔄 `Primer flujo completo de Push`

```bash
<git status>
<git add .>
<git commit -m "Primer cambio">
<git pull origin main>
<git push origin main>
```

Lo que hace

```bash
Modificar archivos
      ↓
git status "Verifica que archivos esta traqueando, fueron modificados o eliminados"
      ↓
git add . "Agrega TODOS los archivos ya sea modificados o agregados reciente mente"
      ↓
git commit "Agrega una descripcion de lo que se realizo (moficicar líneas de codigo, modificar archivos, carpetas, etc.)"
      ↓
git pull "Baja todos los cambios reciente mente creados"
      ↓
git push "sube los cambios agregados a la nube"
      ↓
GitHub
```

--- 

### 🌱 `git branch`

Sirve para ver las ramas existentes y en cuál estamos parados.

```bash
git branch
```

---

### 🔀 `git checkout`

Principalmente se usa para cambiar de rama.

Aunque también puede:

    . Crear nuevas ramas.

    . Restaurar archivos a una versión anterior.

    . Ir a una versión de un commit específico.

    . Ir al commit anterior.

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

# 🧰 Clase 5 - Git Tag y Versiones

### 📌 `¿Qué son los Git Tags?`

En Git, las etiquetas o tags sirven para marcar commits que son importantes dentro del historial de un proyecto.

Se suelen usar para identificar versiones como

    v1.0

    v1.1

    v2.0

Resultan muy útiles para señalar lanzamientos o versiones estables.

---

### 🔎 `Listar etiquetas`

Para ver todas las etiquetas existentes

    <git tag>

Ejemplos


    v1.0

    v1.1

    v1.2

Tambien se pueden filtrar las etiquetas

```bash
<git tag -l "v1.*">
```

---

### 🏷️ `Crear una etiqueta`

Una etiqueta simple se puede crear con

```bash
<git tag v1.0>
```

Esto genera una etiqueta que apunta al commit actual.

----

### 📝 `Etiquetas anotadas`

También se puede crear una etiqueta anotada

```bash
<git tag -a v1.0 -m "Versión 1.0">
```

Las etiquetas anotadas pueden guardar información extra como:

. 👤 Autor.

. 📧 Correo electrónico.

. 📅 Fecha.

. 💬 Mensaje de la etiqueta.

Resultan muy útiles para versiones o publicaciones importantes.

---

### 🪶 `Etiquetas ligeras`

Una etiqueta ligera funciona como un simple marcador sobre un commit.

```bash
<git tag v1.0>
```

No guarda información adicional como un mensaje de etiqueta.

---

### 📤 `Compartir etiquetas`

Los tags no siempre se suben solos al usar git push.

Para subir una etiqueta puntual

```bash
<git push origin v1.0>
```

Para subir todas las etiquetas

```bash
<git push origin --tags>
```

---

### 🗑️ `Eliminar etiquetas`

Para borrar una etiqueta local

```bash
<git tag -d v1.0>
```

Si también se quiere borrar del repositorio remoto

```bash
<git push origin --delete v1.0>
```

---

### 🔢 `Versionado`

Una forma común de nombrar versiones es


    v1.0.0

Se puede leer comp

    MAJOR.MINOR.PATCH

Ejemplo


    v2.4.1

| Número | Significado aproximado |
| :--- | :--- |
| 2 | Versión principal |
| 4 | Nuevas funcionalidades |
| 1 | Correcciones o ajustes |

---

### 🧠 `Resumen de Tags`

| Acción| Comando |
| :--- | --- |
| Ver tags | git tag |
| Crear tag |	git tag v1.0 |
| Crear tag anotado |	git tag -a v1.0 -m "Versión 1.0" |
| Eliminar tag local |	git tag -d v1.0 |
| Subir un tag |	git push origin v1.0 |
| Subir todos |	git push origin --tags |
| Eliminar tag remoto |	git push origin --delete v1.0 |


[!TIP]
Los tags permiten guardar puntos clave del historial del proyecto y asociarlos a una versión concreta.

---

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

# 🔄️ Clase 6 - Desacer Cambios y Correcciones

### ❌ `¿Qué pasa si utilizamos el mismo nombre dos veces?`

Los tags tienen que tener nombres únicos dentro del repositorio.

Por ejemplo, si ya existe

```bash
<git tag v1.0>
```

y se vuelve a ejecutar

```bash
<git tag v1.0>
```

Git va a mostrar un error porque esa etiqueta ya existe.

---

### 🔎 `Comprobar los tags existentes`

```bash
<git tag>
```

---

### 🛠️ `Solución`

Si se creó un tag por error, se puede borrar de la siguiente forma

```bash
<git tag -d v1.0>
```

Después se puede volver a crear apuntando al commit correcto.

Por ejemplo

```bash
<git tag v1.0>
```

Si el tag ya se había subido a GitHub, hay que borrar también la versión remota

```bash
<git push origin --delete v1.0>
```

Y después volver a subirlo

```bash
git push origin v1.0
```

---

### 🔄 `Flujo para corregir un Tag`

```bash
Tag incorrecto "Detectamos el Tag incorrecto"
      ↓
git tag -d v1.0 "Eliminanos el Tag incorrecto con el argumento (-d)"
      ↓
Crear tag correcto "Agregamos el Tag que corresponde"
      ↓
git tag v1.0 
      ↓
git push origin v1.0 "Subimos el cambio a la nube"
```

---

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

# 🔎 Clase 7 - Git Diff y Estructura del Readme

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

### 📝 `Documentación del curso`

Git y GitHub tienen muchísimos comandos.

A lo largo de las clases fuimos viendo distintos comandos relacionados con

    📂 Repositorios.

    🌿 Ramas.

    🔀 Merge.

    ☁️ Repositorios remotos.

    🔑 SSH.

    📤 Push.

    📥 Pull.

    🏷️ Tags.

    📄 README.

Como actividad grupal hay que mantener un archivo

```bash
README.md
```

con todas las clases y comandos vistos durante el curso.

Este archivo puede estar dentro del directorio:

```bash
class-git
```

o dentro de otro directorio que elija el grupo.

---

### 🎯 `Objetivo`

La idea es mantener la documentación de las clases usando Markdown.

El README tiene que contener los temas vistos en clase y actualizarse a medida que aparecen nuevos comandos.

[!IMPORTANT]
La documentación también es parte del trabajo profesional con Git y GitHub.

---

### 📁 `Ejemplo de estructura`

```bash
repositorio/
│
├── class-git/
│   └── README.md
│
├── ejercicios/
│
└── proyectos/
```

---
### ⚡ `Comandos rápidos`
| Comando |	¿Qué hace? |
| :--- | :--- |
| git init |	Inicializa un repositorio |
| git clone URL |	Clona un repositorio |
| git status |	Muestra el estado de los archivos |
| git add . |	Agrega cambios al staging |
| git commit -m "mensaje" |	Crea un commit |
| git log |	Muestra el historial |
| git branch |	Muestra las ramas |
| git checkout rama |	Cambia de rama |
| git switch rama |	Cambia de rama |
| git branch -M main |	Renombra la rama actual a main |
| git fetch |	Descarga referencias del remoto |
| git pull |	Descarga e integra cambios | 
| git merge rama |	Fusiona una rama |
| git push origin main |	Sube cambios a GitHub |
| git remote -v |	Muestra los repositorios remotos |
| git remote set-url origin URL |	Cambia la URL del remoto |
| git tag |	Muestra los tags | 
| git tag v1.0 |	Crea un tag | 
| git push origin --tags |	Sube todos los tags |
| gitk | Abre el visor gráfico de Git |

---

### 🔄 `Flujo básico de Git`
```bash
git pull origin main
       ↓
git pull origin second
       ↓
git pull origin "Rama_de_trabajo"
       ↓
Modificar archivos
       ↓
git status
       ↓
git add .
       ↓
git commit
       ↓
git pull
       ↓
git push origin "Rama_en_la_que_estas_parado"
       ↓
     GitHub
```

---
# 🗂️ Clase 8 - Manejo de Ramas

> Es bueno recordar sobre gitk. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado.


### Para instalar gitk debemos ejecutar los siguientes comandos:



```sh

  sudo apt-get update


  sudo apt-get install gitk

```

### Repasa: ¿Qué es Git?

```sh
Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

Comandos para manejo de ramas en GitHub
Crear una rama:



git branch branchName #Crear una rama
git checkout -b branchName #También crea una rama
git checkout branchName #Movernos a otra rama 
git push origin branchName #Publicar una rama local al repositorio remoto
```

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

---
# 📚 Clase 9 - Configurar múltiples colaboradores

### Configurar múltiples colaboradores en un repositorio de GitHub

```sh
Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.
```

## Cómo agregar colaboradores en Github

> Solo debemos entrar a la configuración de colaboradores de nuestro proyecto. Se encuentra en:

> Repositorio > Settings > Collaborators
Ahí, debemos añadir el email o username de los nuevos colaboradores.

#### Si, como colaborador, agregaste erróneamente el mensaje del commit, lo puedes cambiar de la siguiente manera:
```sh
Hacer un commit con el nuevo mensaje que queremos, esto nos abre el editor de texto de la terminal:

git commit —amend #Corregimos el mensaje
git pull origin main #Traer el repositorio remoto
git push --set-upstream origin main #Ejecutar el cambio, el error arreglado

Comienzo del colaborador
cd Documentos #Abre git bash
mkdir class-git #Crea la carpeta o directorio de trabajo
ls -al #Revisa lo que va haciendo, los archivos o directorios que tiene
# 1. No debe hacer un git init, debe buscar el repositorio en el cual esta invitado a participar, por supuesto en GitHub.
# 2. Pasa a clonar desde HTTPS, copiar la url, esto es porque no se arranca el proyecto desde cero, se esta uniendo otro colaborador.
# 3. En git bash ponemos el siguiente comando.
git clone url-copiada-github #Esto hace que clonemos el repositorio
# 4. No pide ni usuario ni contraseña si el repositorio es publico.
code . #Abre VSC y comienza con cambios, o abre el siguiente comando para hacer modificaciones
vim historia.txt #Vamos a escribir: Aquí esta un nuevo colaborador
vim escribimos el mensaje del commit #Esto en Ubuntu
ctrl + x
s #Para un si 
enter #Terminado el mensaje del commit
vim escribimos el mensaje del commit #Esto en git bash window
esc #Presionamos escaner luego de terminar de escribir
:wq! #Para salir del editor vim en window
git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"
git pull origin main
git fetch
gti branch #Para ver las ramas que se trajo, no se trae sino solo main, si hay mas debes crearlas local
git log #Para ver toda las historia
git log --graph #Vemos el grafico de las diferentes ramas y del commit que acabamos de hacer que esta en el main, Git es una base de datos de toda las historia de todo lo que se ha hecho
git push origin main #Va a pedir un email que será el del colaborador, su contraseña.
# 5. Nos trae un denegado, ¿Por qué? Porque en el proceso de abordaje el jefe no le dio acceso: el dueño del repositorio no le agregó dandole acceso.
# 6. Ir a settings del repositorio, veremos la opsión Collaborators, agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.
# 7. Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.
# 8. El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.
git pull origin main
git push origin main #Colocar nombre de usuario y contraseña, listo
# 9. El dueño del repositorio no ve los cambios, ¿Qué hacer?
git pull origin main
git fetch
git log --stat #Se verá claro que el colaborador ingreso su primer commit
# 10. A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.
```


# 📥 Clase 10 - Flujo de trabajo

```sh
Flujo de trabajo profesional
```
Haciendo merge de ramas de desarrollo a main


    Para poder desarrollar software de manera óptima y ordenada, necesitamos tener un flujo de trabajo profesional, que nos permita trabajar en conjunto sin interrumpir el trabajo de otros desarrolladores.

Una buena práctica de flujo de trabajo sería la siguiente:

```bash
Crear ramas
Asignar una rama a cada programador
El programador baja el repositorio con git pull origin master
El programador cambia de rama
El programador trabaja en esa rama y hace commits
El programador sube su trabajo con git push origin #nombre_rama
El encargado de organizar el proyecto baja, revisa y unifica todos los cambios
```

---

# 📑 Clase 11 - Archivos Binarios
```sh
Flujo de trabajo profesional -> Archivos binarios
```

    Las imagenes cargandolas en el repositorio, representan un problema: porque las imagenes son pesadas, y si la subimos al repositorio, siempre que hagamos cambios, vamos a estar trayendo la imagen siempre, estas imagenes son binarios para GitHub, mientras mas binarios carguemos, más pesado va a ser el repositorio, algo que no es parte de las buenas practicas.


Otra cosa muy importante a tener en cuenta, es que en cada commit que hagamos hay un tamaño predefinido para la carga, este no lo podemos superar o no podremos subir los commits, el tamaño es 100 mb, si acoplamos un archivo binario en un commit que pese mas de esto, será un problema, no nos dejará seguir commiteando, porque siempre seguirá arrastrando el archivo binario.
---
# ✨ Clase 12 - Ya hemos llegado al nivel más alto de GitHub

>Es momento de presentar el README.md con todos los comandos y prácticas en cada clase, ya terminando este semestre, es hoy que debe estar completo este archivo en el lenguaje de Markdown, lo voy a pedir en la clase en vivo por zoom. los espero.
















Profesor Ariel Betancud
--
### 💡 `Regla fácil para recordar`
| Comando | → | ¿Que hace? |
| :--- | :---: | :--- |
| git add | → | Preparo los cambios |
| git commit | → | Guardo los cambios |
| git pull | → | Traigo cambios desde GitHub | 
| git push | → | Envío mis commits a GitHub |
| git fetch | → | Reviso cambios del remoto |

---

# 💻 SYNTAX ERROR

> **Git & Bash Cheat Sheet**
>
> `git` • `bash` • `github`
>
> **Aprender • Practicar • Crear**

---

***🖨️ Este perfil fue revisado, sellado y aprobado por el Departamento de Burocracia de Git***
  
  `N° de expediente: GIT-2026-003 | Fecha de emisión: Hoy | Validez: Hasta el próximo commit --force`