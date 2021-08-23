package com.sda.onlineAuction.service;

import com.sda.onlineAuction.dto.BidDto;
import com.sda.onlineAuction.mapper.BidMapper;
import com.sda.onlineAuction.model.Bid;
import com.sda.onlineAuction.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {

    @Autowired
    private BidMapper bidMapper;

    @Autowired
    private BidRepository bidRepository;

    public void placeBid(BidDto bidDto, String productId, String userEmail) {
        //System.out.println("Added value " + bidDto.getValue() + " for the product with ID " + productId + " and  the user with this bid was " + userEmail);
        Bid bid = bidMapper.map(bidDto, productId, userEmail);
        bidRepository.save(bid);

    }

}
