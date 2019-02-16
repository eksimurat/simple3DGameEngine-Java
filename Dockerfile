FROM openjdk

LABEL maintainer="Murat Eksi"

# Configure required environment
ENV WORKSPACE /gameEngine-java-workspace

# Create and set home directory
RUN mkdir $WORKSPACE
WORKDIR $WORKSPACE


# Copy all application files
COPY . $WORKSPACE