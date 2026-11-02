// Ejercicio 2: Crear un sistema simple de gestión de tareas
function createTaskManager() {
    let tasks = [];
    let nextId = 1;

    return {
        addTask: function(task) {
            const newTask = {
                id: nextId++,
                description: task,
                completed: false
            };
            tasks.push(newTask);
            return newTask;
        },
        completeTask: function(taskId) {
            const task = tasks.find(t => t.id === taskId);
            if (!task) {
                return false; // no existe una tarea con ese id
            }
            task.completed = true;
            return true;
        },
        listTasks: function() {
            // Devuelve una copia para que nadie modifique el array interno
            return tasks.map(t => ({ ...t }));
        }
    };
}

