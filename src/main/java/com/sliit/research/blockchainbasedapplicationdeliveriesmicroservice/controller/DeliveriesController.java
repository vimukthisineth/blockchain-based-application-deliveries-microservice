package com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.controller;

import com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.dto.DeliveryRouteDto;
import com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.service.DeliveryRouteService;
import com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.utils.RoutePath;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.io.IOException;

@RestController
public class DeliveriesController {

    @Autowired
    DeliveryRouteService deliveryRouteService;

    @PostMapping("/calculateRoute")
    public RoutePath calculateRoute(@Valid @RequestBody DeliveryRouteDto deliveryRoute) throws IOException, JSONException {
        return deliveryRouteService.calculateRoute(deliveryRoute);
    }

}
