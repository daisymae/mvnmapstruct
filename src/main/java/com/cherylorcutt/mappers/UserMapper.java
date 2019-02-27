package com.cherylorcutt.mappers;

import com.cherylorcutt.domain.User;
import com.cherylorcutt.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserCommand userToUserCommand(User user);

  User userCommandToUser(UserCommand userCommand);
}
