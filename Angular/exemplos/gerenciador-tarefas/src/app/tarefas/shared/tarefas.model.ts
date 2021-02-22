export interface Tarefa {
    id: number;
    name: string;
    completed: boolean;
}

// GET Tarefas
export interface ResponseTarefas {
    tarefas: Tarefa[]
}
// GET Tarefa
export interface ResponseTarefa {
    tarefa: Tarefa
}