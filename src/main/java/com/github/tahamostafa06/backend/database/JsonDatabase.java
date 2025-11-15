package com.github.tahamostafa06.backend.database;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public abstract class JsonDatabase<RecordType> {
    private String filePath;
    protected Map<String, RecordType> records;

    protected JsonDatabase(String filePath) throws IOException {
        this.filePath = filePath;
        load();
    }

    protected void load() throws IOException {
        var jsonReader = new JsonReader(new FileReader(this.filePath));
        var recordsJson = JsonParser.parseReader(jsonReader).getAsJsonObject();
        for (var entry : recordsJson.entrySet()) {
            var record = parseEntry(entry);
            this.records.put(entry.getKey(), record);
        }
    }

    public void saveToFile() throws IOException {
        var gson = new GsonBuilder().setPrettyPrinting().create();
        var fileWriter = new FileWriter(this.filePath);
        gson.toJson(this.records, fileWriter);
    }

    protected abstract RecordType parseEntry(Entry<String, JsonElement> entry);

}