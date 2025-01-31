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
    "response": "Hello Deepseek"
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

![Screenshot (112)](https://github.com/user-attachments/assets/0c71de1d-f996-4800-858a-2e0733ad5900)
![Screenshot (113)](https://github.com/user-attachments/assets/1445d813-a561-4097-b7dc-c012678746f5)
![Screenshot (115)](https://github.com/user-attachments/assets/49714fe0-4cdf-453a-84b6-5bb523ad2bb8)
![Screenshot (116)](https://github.com/user-attachments/assets/40eb98e4-26ad-498a-89fd-c3940394b8da)
![Screenshot (117)](https://github.com/user-attachments/assets/a1fcf109-17ba-4e40-a7c7-762c36c12be4)
![Screenshot (111)](https://github.com/user-attachments/assets/1e908e4c-5f2b-4ad9-b9c3-fbed200d8bdc)
