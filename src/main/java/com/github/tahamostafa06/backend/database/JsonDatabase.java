package com.github.tahamostafa06.backend.database;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import com.github.tahamostafa06.backend.database.records.Record;

public abstract class JsonDatabase<RecordType extends Record> {
    private String filePath;
    protected Map<String, RecordType> records;
    protected TypeToken<Map<String, RecordType>> deserializationTypeToken = new TypeToken<>() {
    };

    protected JsonDatabase(String filePath) throws IOException {
        this.filePath = filePath;
        load();
    }

    protected void load() throws IOException {
        var jsonReader = new JsonReader(new FileReader(this.filePath));
        var gson = new Gson();
        gson.fromJson(jsonReader, deserializationTypeToken);
    }

    public RecordType getRecord(String key) {
        return records.get(key);
    }

    public void saveToFile() throws IOException {
        var gson = new GsonBuilder().setPrettyPrinting().create();
        var fileWriter = new FileWriter(this.filePath);
        gson.toJson(this.records, fileWriter);
    }

}