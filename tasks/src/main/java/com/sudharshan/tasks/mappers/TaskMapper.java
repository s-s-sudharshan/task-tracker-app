package com.sudharshan.tasks.mappers;

import com.sudharshan.tasks.domain.dto.TaskDto;
import com.sudharshan.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
