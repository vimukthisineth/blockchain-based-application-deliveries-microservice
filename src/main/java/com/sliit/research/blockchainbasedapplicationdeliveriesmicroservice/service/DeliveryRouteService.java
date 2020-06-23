package com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.service;

import com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.dto.DeliveryRouteDto;
import com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.utils.RoutePath;
import org.json.JSONException;

import java.io.IOException;

public interface DeliveryRouteService {
    RoutePath calculateRoute(DeliveryRouteDto deliveryRoute) throws IOException, JSONException;
}
