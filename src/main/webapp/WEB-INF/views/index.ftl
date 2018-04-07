<html>
<head>
    <title>Twitter Image App</title>
</head>
<body>
<h1>BotList</h1>
<table>
    <thead>
        <tr>
            <th>botName</th>
            <th>koreanBotName</th>
        </tr>
    </thead>
    <tbody>
        <#list botList as bot>
            <tr>
                <td>${bot.botName}</td>
                <td>${bot.koreanBotName}</td>
            </tr>
        </#list>
    </tbody>
</table>
<form method="post" action="/createBot">
    <input type="text" name="botName" placeholder="botName" />
    <input type="text" name="koreanBotName" placeholder="koreanBotName" />
    <button type="submit">New Bot</button>
</form>
</body>
</html>