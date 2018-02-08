package com.stupidchen.blog.controller;

import com.stupidchen.blog.data.DataFactory;
import com.stupidchen.blog.model.Archive;
import com.stupidchen.blog.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mike on 12/15/17.
 */

@RestController
public class ArchiveController {
    @RequestMapping(name = "/archive", method = RequestMethod.GET)
    public Archive getArchive(String id) {
        return DataFactory.getArchive(id);
    }

    @RequestMapping(name = "/archive", method = RequestMethod.PUT)
    public Response putArchive(String id, Archive archive) {
        return DataFactory.putArchive(id, archive);
    }
}
