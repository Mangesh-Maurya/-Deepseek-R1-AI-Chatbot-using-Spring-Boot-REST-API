Deepseek-R1 AI Chatbot using Spring Boot REST API
🚀 A chatbot powered by Deepseek-R1, integrated with Spring Boot and Ollama to process and respond to user queries using AI-based natural language processing.

📌 Features
✅ REST API for AI-powered chatbot responses
✅ Integration with Deepseek-R1 and Ollama
✅ Uses Spring AI ChatClient for seamless communication
✅ Handles dynamic user queries via HTTP requests
✅ Error handling for missing models and API failures

🛠 Tech Stack
Backend: Spring Boot, Spring AI, Java
AI Model: Deepseek-R1 (via Ollama)
API Framework: RESTful APIs
Dependency Management: Maven
📂 Project Structure
bash
Copy
Edit
Deepseek-AI-Chatbot
│── src/main/java/com/ollama/backend
│   ├── controller/AiController.java    # REST API controller
│   ├── service/AiService.java          # Service interface
│   ├── service/AiServiceImp.java       # AI response implementation
│   ├── DeepseekAiSpringApplication.java # Main Spring Boot application
│── src/main/resources
│   ├── application.properties          # Configurations
│── pom.xml                              # Dependencies
│── README.md                            # Project documentation
⚡ Setup & Installation
1️⃣ Prerequisites
🔹 Java 17+
🔹 Maven
🔹 Ollama installed on your system (Installation Guide)

2️⃣ Clone the Repository
sh
Copy
Edit
git clone https://github.com/yourusername/Deepseek-R1-AI-Chatbot-Spring-Boot.git
cd Deepseek-R1-AI-Chatbot-Spring-Boot
3️⃣ Install Dependencies
sh
Copy
Edit
mvn clean install
4️⃣ Configure Ollama
Before running the application, pull the Deepseek-R1 model:

sh
Copy
Edit
ollama pull deepseek-r1
5️⃣ Run the Application
sh
Copy
Edit
mvn spring-boot:run
6️⃣ Test the API
Send a request using Postman or cURL:

sh
Copy
Edit
curl -X GET "http://localhost:8083/api/v1/ai?query=Hello Deepseek"
Expected Response:  Hello! How can I assist you today? 😊

json
Copy
Edit
{
    "response": "Cricket is a sport played between two teams of eleven players..."
}
🛠 Troubleshooting
🔹 Error: model "mistral" not found
✅ Fix: Ensure you pulled the correct model using ollama pull deepseek-r1.

🔹 Error: 500 Internal Server Error
✅ Fix: Verify your Spring Boot configuration and Ollama setup.

📌 Contribution
Contributions are welcome! Feel free to fork this repo and submit PRs.

📜 License
This project is open-source and available under the MIT License.
