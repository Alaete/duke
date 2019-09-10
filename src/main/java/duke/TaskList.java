package duke;

import duke.task.Task;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Encapsulates a task list.
 */
public class TaskList {
    protected List<Task> taskList;

    /**
     * Constructs a TaskList object with saved data on hard disk.
     *
     * @param taskList  Task list data retrieved from hard disk.
     */
    public TaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    /**
     * Constructs a TaskList object with no prior data.
     */
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    /**
     * Lists tasks in task list.
     *
     * @return Tasks in task list as a string.
     */
    public String list() {
        String message = "";
        int index = 1;
        for (Iterator iterator = taskList.iterator(); iterator.hasNext(); index++) {
            assert (index >= 1);
            message = message + index + "." + iterator.next() + "\n";
        }
        return message;
    }

    /**
     * Retrieves task at a given index.
     *
     * @param index  Index of task to be retrieved.
     * @return Task at given index.
     */
    public Task get(int index) {
        assert (index <= taskList.size());
        return taskList.get(index);
    }

    /**
     * Removes task at a given index.
     *
     * @param index  Index of task to be removed.
     * @return Task at given index.
     */
    public Task remove(int index) {
        assert (index <= taskList.size());
        return taskList.remove(index);
    }

    /**
     * Returns size of task list.
     *
     * @return Size of the task list.
     */
    public int size() {
        return taskList.size();
    }

    /**
     * Adds task to task list.
     *
     * @param task  Task to be added.
     */
    public void add(Task task) {
        taskList.add(task);
        assert (taskList.contains(task));
    }

    /**
     * Retrieves list of tasks containing keyword.
     *
     * @param keyword  Keyword to be searched for.
     * @return List of tasks containing keyword as a String.
     */
    public String find(String keyword) {
        String message = "";
        int i = 1;
        int index = 1;
        for (Iterator iterator = taskList.iterator(); iterator.hasNext(); i++) {
            assert (i >= 1);
            assert (index >= 1);
            Task current = (Task) iterator.next();
            if (current.containsKeyword(keyword)) {
                message = message + index + "." + current + "\n";
                index++;
            }
        }
        return message;
    }

    /**
     * Returns iterator of task list.
     *
     * @return Iterator of the task list.
     */
    public Iterator iterator() {
        return taskList.iterator();
    }
}
