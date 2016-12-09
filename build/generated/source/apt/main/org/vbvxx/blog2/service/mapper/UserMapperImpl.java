package org.vbvxx.blog2.service.mapper;

import java.util.ArrayList;

import java.util.List;

import java.util.Set;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

import org.vbvxx.blog2.domain.Authority;

import org.vbvxx.blog2.domain.User;

import org.vbvxx.blog2.service.dto.UserDTO;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2016-12-09T16:19:09+0100",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"

)

@Component

public class UserMapperImpl implements UserMapper {

    @Override

    public UserDTO userToUserDTO(User user) {

        if ( user == null ) {

            return null;
        }

        UserDTO userDTO = new UserDTO();

        if ( userDTO.getAuthorities() != null ) {

            Set<String> set = stringsFromAuthorities( user.getAuthorities() );

            if ( set != null ) {

                userDTO.getAuthorities().addAll( set );
            }
        }

        return userDTO;
    }

    @Override

    public List<UserDTO> usersToUserDTOs(List<User> users) {

        if ( users == null ) {

            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>();

        for ( User user : users ) {

            list.add( userToUserDTO( user ) );
        }

        return list;
    }

    @Override

    public User userDTOToUser(UserDTO userDTO) {

        if ( userDTO == null ) {

            return null;
        }

        User user = new User();

        user.setLogin( userDTO.getLogin() );

        user.setFirstName( userDTO.getFirstName() );

        user.setLastName( userDTO.getLastName() );

        user.setEmail( userDTO.getEmail() );

        user.setActivated( userDTO.isActivated() );

        user.setLangKey( userDTO.getLangKey() );

        Set<Authority> set = authoritiesFromStrings( userDTO.getAuthorities() );

        if ( set != null ) {

            user.setAuthorities( set );
        }

        return user;
    }

    @Override

    public List<User> userDTOsToUsers(List<UserDTO> userDTOs) {

        if ( userDTOs == null ) {

            return null;
        }

        List<User> list = new ArrayList<User>();

        for ( UserDTO userDTO : userDTOs ) {

            list.add( userDTOToUser( userDTO ) );
        }

        return list;
    }
}

