# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2020.3.3\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2020.3.3\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\code\HL_assgin\c\c_programming

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\code\HL_assgin\c\c_programming\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/c_programming.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/c_programming.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/c_programming.dir/flags.make

CMakeFiles/c_programming.dir/c_13.cpp.obj: CMakeFiles/c_programming.dir/flags.make
CMakeFiles/c_programming.dir/c_13.cpp.obj: ../c_13.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\code\HL_assgin\c\c_programming\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/c_programming.dir/c_13.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\c_programming.dir\c_13.cpp.obj -c C:\code\HL_assgin\c\c_programming\c_13.cpp

CMakeFiles/c_programming.dir/c_13.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/c_programming.dir/c_13.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\code\HL_assgin\c\c_programming\c_13.cpp > CMakeFiles\c_programming.dir\c_13.cpp.i

CMakeFiles/c_programming.dir/c_13.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/c_programming.dir/c_13.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\code\HL_assgin\c\c_programming\c_13.cpp -o CMakeFiles\c_programming.dir\c_13.cpp.s

# Object files for target c_programming
c_programming_OBJECTS = \
"CMakeFiles/c_programming.dir/c_13.cpp.obj"

# External object files for target c_programming
c_programming_EXTERNAL_OBJECTS =

c_programming.exe: CMakeFiles/c_programming.dir/c_13.cpp.obj
c_programming.exe: CMakeFiles/c_programming.dir/build.make
c_programming.exe: CMakeFiles/c_programming.dir/linklibs.rsp
c_programming.exe: CMakeFiles/c_programming.dir/objects1.rsp
c_programming.exe: CMakeFiles/c_programming.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\code\HL_assgin\c\c_programming\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable c_programming.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\c_programming.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/c_programming.dir/build: c_programming.exe

.PHONY : CMakeFiles/c_programming.dir/build

CMakeFiles/c_programming.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\c_programming.dir\cmake_clean.cmake
.PHONY : CMakeFiles/c_programming.dir/clean

CMakeFiles/c_programming.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\code\HL_assgin\c\c_programming C:\code\HL_assgin\c\c_programming C:\code\HL_assgin\c\c_programming\cmake-build-debug C:\code\HL_assgin\c\c_programming\cmake-build-debug C:\code\HL_assgin\c\c_programming\cmake-build-debug\CMakeFiles\c_programming.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/c_programming.dir/depend
