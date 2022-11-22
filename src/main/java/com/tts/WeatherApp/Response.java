package com.tts.WeatherApp;

import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
	public Map<String, String> coord;
	public List<Map<String, String>> weather;
	public String base;
	public Map<String, String> main;
	public String visibility;
	public Map<String, String> wind;
	public Map<String, String> clouds;
	public String dt;
	public Map<String, String> sys;
	public String timezone;
	public String id;
	public String name;
	public String cod;
}