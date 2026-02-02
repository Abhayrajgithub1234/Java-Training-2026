JC = javac
JV = java

SRC_DIR = src
BUILD_DIR = build

JAVA_FILES := $(shell find $(SRC_DIR) -name "*.java")

MAIN_CLASS = app.Main

.PHONY: all compile run clean

java: compile run clean

compile:
	@mkdir -p $(BUILD_DIR)
	@$(JC) -d $(BUILD_DIR) $(JAVA_FILES)

run: compile
	@$(JV) -cp $(BUILD_DIR) $(MAIN_CLASS)

clean:
	@rm -rf $(BUILD_DIR)
