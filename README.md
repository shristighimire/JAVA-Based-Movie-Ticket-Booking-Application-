# Movie Ticket Booking App

## Project Description
The **Movie Ticket Booking App** is a Java Swing-based desktop application designed for:
- Selecting movie tickets and snacks.
- Entering user and payment details.
- Providing a responsive and user-friendly interface.

## Project Structure

## Getting Started
### Prerequisites
- Java Development Kit (JDK)
- A Java IDE or terminal for compilation and execution

### How to Run
1. Navigate to the `src` directory and compile the Java file:
   ```bash
   javac -d bin src/com/example/movieticket/MovieTicketApp.java



---

### 4. **Creating the Files**
If you'd like to automate this file creation process, you can use the following Bash script:

```bash
# Create directories
mkdir -p MovieTicketApp/src/com/example/movieticket
mkdir -p MovieTicketApp/images

# Create files
touch MovieTicketApp/src/com/example/movieticket/MovieTicketApp.java
touch MovieTicketApp/images/mess_image.png
touch MovieTicketApp/images/male_image.png
touch MovieTicketApp/README.md
touch MovieTicketApp/.gitignore
***

# Add content to .gitignore
echo -e "*.class\n*.log\n*.png" > MovieTicketApp/.gitignore

# Add content to README.md
cat <<EOT > MovieTicketApp/README.md
# Movie Ticket Booking App

## Project Description
The **Movie Ticket Booking App** is a Java Swing-based desktop application designed for:
- Selecting movie tickets and snacks.
- Entering user and payment details.
- Providing a responsive and user-friendly interface.



## How to Run
1. Compile: `javac -d bin src/com/example/movieticket/MovieTicketApp.java`
2. Run: `java -cp bin com.example.movieticket.MovieTicketApp`

