package com.example.bfhl.dto;
import lombok.Getter;
import lombok.Setter;



import java.util.List;

@Getter
@Setter
public class RequestDTO {
     private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
