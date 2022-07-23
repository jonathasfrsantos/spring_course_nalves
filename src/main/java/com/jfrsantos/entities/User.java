package com.jfrsantos.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@EqualsAndHashCode.Include
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	

	
	
}
