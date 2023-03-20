package com.example.demo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class DraftAddRequest implements Serializable {
	private List<Request> articles;
}
