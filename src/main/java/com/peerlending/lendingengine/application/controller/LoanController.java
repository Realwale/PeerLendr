package com.peerlending.lendingengine.application.controller;


import com.peerlending.lendingengine.application.model.LoanRequest;
import com.peerlending.lendingengine.domain.model.User;
import com.peerlending.lendingengine.domain.repository.LoanRequestRepository;
import com.peerlending.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    private LoanRequestRepository loanRequestRepository;
    private UserRepository userRepository;

    @Autowired
    public LoanController(LoanRequestRepository loanRequestRepository, UserRepository userRepository) {
        this.loanRequestRepository = loanRequestRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/loan/request")
    public void requestLoan(@RequestBody LoanRequest loanRequest){

        System.out.println(loanRequest);
    }

    @GetMapping("/loan/request")
    public List<User> findUsers(){
        return userRepository.findAll();
    }
}
