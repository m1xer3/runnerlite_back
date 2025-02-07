package ru.runnerlite.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class RefCitiesDto implements Serializable {
	private final Integer id;
	private final String name;
}
