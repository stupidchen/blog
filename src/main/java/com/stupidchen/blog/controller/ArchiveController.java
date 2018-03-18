package com.stupidchen.blog.controller;

import com.stupidchen.blog.data.DataFactory;
import com.stupidchen.blog.model.Archive;
import com.stupidchen.blog.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mike on 12/15/17.
 */

@RestController
public class ArchiveController {
    @RequestMapping(name = "/archive", method = RequestMethod.GET)
    public List<Archive> getArchive() {
        return DataFactory.getArchives();
    }

    @RequestMapping(name = "/archive", method = RequestMethod.POST)
    public Response postArchive(Archive archive) {
        return DataFactory.addArchive(archive);
    }

    @RequestMapping(name = "/archive", method = RequestMethod.PUT)
    public Response putArchive(Archive archive) {
        return DataFactory.updateArchive(archive);
    }

    @RequestMapping(name = "/archive", method = RequestMethod.GET)
    public Archive getArchiveById(String id) {
        return DataFactory.getArchiveById(id);
    }

    @RequestMapping(name = "/archive", method = RequestMethod.PUT)
    public Response putArchiveById(String id, Archive archive) {
        return DataFactory.updateArchiveWithId(id, archive);
    }

    @RequestMapping(name = "/archive", method = RequestMethod.DELETE)
    public Response deleteArchive(String id) {
        return DataFactory.deleteArchive(id);
    }
}
