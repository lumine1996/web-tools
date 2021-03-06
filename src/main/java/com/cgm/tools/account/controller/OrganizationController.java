package com.cgm.tools.account.controller;

import com.cgm.tools.account.entity.Organization;
import com.cgm.tools.account.service.IOrganizationService;
import com.cgm.tools.base.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author cgm
 */
@CrossOrigin
@RestController
@Api(tags = "组织")
@RequestMapping("/api/organization")
public class OrganizationController {
    @Resource
    private IOrganizationService organizationService;

    @ApiOperation("添加组织")
    @PostMapping
    public ResponseData addOrganization(
            @ApiParam(value = "组织", required = true) @RequestBody Organization organization) {
        organizationService.addOrganization(organization);
        return new ResponseData(organization);
    }
}
