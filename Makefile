.PHONY: list start stop status gitPush apache ubuntu
.DEFAULT_GOAL := start

COMPOSE = docker-compose -p $(PROJECT)
PROJECT ?= gameEngine-java-workspace
DISPLAY = 192.168.58.49:0.0

list:
	@(grep -oe '^[[:lower:][:digit:]_\-]\{1,\}' Makefile | uniq)

start:
	$(COMPOSE) run --rm -e DISPLAY=$(DISPLAY) game_engine bash

stop:
	$(COMPOSE) stop

status:
	$(COMPOSE) ps