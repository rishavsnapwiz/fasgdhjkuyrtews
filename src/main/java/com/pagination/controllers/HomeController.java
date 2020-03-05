	package com.pagination.controllers;

import com.pagination.entities.Photo;
import com.pagination.service.PhotoService;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private PhotoService photoService;

    @GetMapping("/photoByOwner")
    @ResponseBody
    public String photoByOwner() {

        //return string of JSON object of photo counts for ex.
        //      { "owner1":  10, "owner2":  4,}
        return "";
    }

    @GetMapping("/mostActive")
    @ResponseBody
    public String mostActive() {
        //return string of JSON object user with max photo count for ex.
        //      { "owner1":  30}
        return "";
    }

}
