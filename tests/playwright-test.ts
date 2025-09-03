import { test, expect } from '@playwright/test';

test('Explore Our Client Work on EPAM', async ({ page }) => {
  // Step 1: Navigate to the EPAM website
  await page.goto('https://www.epam.com/');

  // Step 2: Select "Services" from the header menu
  await page.click('text=Services');

  // Step 3: Click the "Explore Our Client Work" link
  await page.click('text=Explore Our Client Work');

  // Step 4: Verify that the "Client Work" text is visible on the page
  const clientWorkText = await page.locator('text=Client Work').isVisible();
  expect(clientWorkText).toBe(true);
});