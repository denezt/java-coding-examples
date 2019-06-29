JC=javac
PRGNAME1=SaveApplicationData
PRGNAME2=LoadApplicationData

all: clean compile
	@printf "Executed All Build Steps...\n"

compile:
	@printf "Starting compilation.\n"
	$(JC)	$(PRGNAME1).java
	$(JC)	$(PRGNAME2).java

clean:
	@printf "Remove older compilation.\n"
	rm -rfv $(PRGNAME1).class
	rm -rfv $(PRGNAME2).class
