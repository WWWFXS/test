package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

@Data
public class Request implements Serializable {
	private String title;
	private String author;
	private String digest;
	private String content;
	@JsonProperty("content_source_url")
	private String contentSourceUrl;
	@JsonProperty("thumb_media_id")
	private String thumbMediaId;
	@JsonProperty("need_open_comment")
	private Integer needOpenComment;
	@JsonProperty("only_fans_can_comment")
	private Integer onlyFansCanComment;


}
