package com.sudharshan.tasks.mappers;


import com.sudharshan.tasks.domain.dto.TaskListDto;
import com.sudharshan.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
