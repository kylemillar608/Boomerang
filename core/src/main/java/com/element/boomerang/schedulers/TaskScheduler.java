package java.com.element.boomerang.schedulers;

import java.com.element.boomerang.tasks.ScheduledTask;

import static java.com.element.boomerang.tasks.ScheduledTask.TaskKey;

public interface TaskScheduler<T extends ScheduledTask> {
    T retrieve(final TaskKey taskKey);
    T schedule(final T task);
    T update(final T task);
    T cancel(final T task);
}
