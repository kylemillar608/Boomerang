package java.com.element.boomerang.tasks;

import java.util.UUID;

public interface ScheduledTask {
    TaskKey getKey();

    //todo define what a task key looks like now that this will be used for
    //several data stores
    class TaskKey {
        private final String taskName;
        private final UUID uniqueId;

        public TaskKey(final String taskName, final UUID uniqueId) {
            this.taskName = taskName;
            this.uniqueId = uniqueId;
        }
    }
}
