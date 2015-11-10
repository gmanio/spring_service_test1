package com.gman;

import com.gman.repository.RepoTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gmanpark on 2015. 11. 10..
 */
public interface UserRepository extends JpaRepository<RepoTest, Long> {}
