MAKEFLAGS:=-rR

all: build

$(if $(MAKECMDGOALS),$(MAKECMDGOALS),%):
	gradle $(if $(MAKECMDGOALS),$(MAKECMDGOALS),$@)

