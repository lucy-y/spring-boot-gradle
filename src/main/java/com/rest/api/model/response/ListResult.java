package com.rest.api.model.response;

import lombok.Data;

import java.util.List;

@Data
public class ListResult<T> extends CommonResult {
    private List<T> list;
}