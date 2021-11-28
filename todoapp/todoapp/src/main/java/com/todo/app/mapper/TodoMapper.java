package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.app.entity.Todo;

// これはマッパー。つまり、オブジェクトとRDBを対応づける記述

// @Mapperと書くだけで、Mapperのインターフェースになる
@Mapper
public interface TodoMapper {
	public List<Todo> selectAll();
	
    public List<Todo> selectIncomplete();
    
    public List<Todo> selectComplete();

	public void add(Todo todo);
	
	public void update(Todo todo);
	
}
